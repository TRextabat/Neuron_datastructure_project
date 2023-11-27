import java.util.ArrayList;
public class Main 
{
    
    public static void main(String[] args)
    {

        int[] epochsArray = {10, 50, 100};
        double[] rateArray = {0.05, 0.01, 0.025};
        ArrayList<Double> mseArray = new ArrayList<>(9);
        Data.norm();
        
        for (int epochs : epochsArray) 
        {
            for (double rate : rateArray ) 
            {
                System.out.println("Results for rate: " +rate+" epochs: " +epochs);
                Neorun neorun = new Neorun(2, rate);
                Train.trainNeuron(neorun, Data.getNormedinput(), Data.getNormedtarget(), epochs);
                mseArray.add(Train.mse);
                
            }
        }

        int i = 0;
        System.out.println("\t"+rateArray[0] + "\t" + rateArray[1] + "\t" + rateArray[2] + "\t");
        for(int epochs: epochsArray)
        {
            System.out.print(epochs+"\t");
            for(double rate : rateArray)
            {
                System.out.print(String.format("%.5f", mseArray.get(i))+ "\t");
                i++;
            }
           System.out.println();
        }


    
    }
}