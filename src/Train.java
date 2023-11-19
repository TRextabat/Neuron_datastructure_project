
public class Train 
{
    public static double mse;
    public static void trainNeuron(Neorun neorun,double[][] valueMatrix, double[] targets, int epochs)
    {   
        double predictedValue;
        double tSquaredError = 0.0;
        
        

        // train a neuron 
        for(int epoch=0; epoch < epochs; epoch++)
        {
            for(int i=0; i < valueMatrix.length; i++)
            {
                neorun.feedForward(valueMatrix[i]);
                neorun.backProp(targets[i]);
            }
        }

        
        //get results for train data
        System.out.println("Hour\t\tAttend\t\tTarget\t\tOutput");
        for(int i = 0; i < targets.length; i++)
        {
            neorun.feedForward(valueMatrix[i]);
            predictedValue = neorun.getOutput();
            System.out.println(
                String.format("%.2f", valueMatrix[i][0] * 15) + "\t\t" +
                String.format("%.2f", valueMatrix[i][1] * 10) + "\t\t" +
                String.format("%.2f", targets[i] * 100) + "\t\t" +
                String.format("%.2f", predictedValue * 100)
            );

            //Calculate squared error
            //double squaredError = Math.pow(targets[i] - predictedValue,2);
            //tSquaredError += squaredError;
            //make code more efficient
            tSquaredError += Math.pow(targets[i] - predictedValue,2);
        }
        // mse:  Mean Square Error
        mse = tSquaredError / valueMatrix.length;
        System.out.println("Mean Square Error (MSE):"+mse);



    }



    
}
