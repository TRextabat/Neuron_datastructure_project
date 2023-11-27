public class Data 
{
    private static double[][] valueMatrix =
    {
        {7.6, 11},
        {8, 10},
        {6.6, 8},
        {8.4, 10},
        {8.8, 12},
        {7.2, 10},
        {8.1, 11},
        {9.5, 9},
        {7.3, 9},
        {8.9, 11},
        {7.5, 11},
        {7.6, 9},
        {7.9, 10},
        {8, 10},
        {7.2, 9},
        {8.8, 10},
        {7.6, 11},
        {7.5, 10},
        {9, 10},
        {7.7, 9},
        {8.1, 11}
    };
    private static double[][] test = {
        {9,7},
        {6,10},
        {8,9},

    };
    private static double[] targets = {77, 70, 55, 78, 95, 67, 80, 87, 60, 88, 72, 58, 70, 76, 58, 81, 74, 67, 82, 62, 82}; 
    private static double[][] normedinput = new double[valueMatrix.length][valueMatrix[0].length];;
    private static double[] normedtarget = new double[targets.length];

    public static void norm()
    {
        normedinput = new double[valueMatrix.length][valueMatrix[0].length];
        normedtarget = new double[targets.length];
        for(int i=0; i<valueMatrix.length; i++)
        {
            normedinput[i][0] = valueMatrix[i][0]/10;
            normedinput[i][1] = valueMatrix[i][1]/15;
            normedtarget[i] = targets[i]/100;

        }
    }
    
    

    public static double[][] getValueMatrix() {
        return valueMatrix;
    }
    public static double[] getTargets() {
        return targets;
    }
    public static double[][] getNormedinput() {
        return normedinput;
    }
    public static double[] getNormedtarget() {
        return normedtarget;
    }


    
           


    
}
