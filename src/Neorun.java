public class Neorun 
{
    private double[] weightMatrix;
    private double[] valueMatrix;
    private double output;
    private double bias;
    private double learningRate;

    public Neorun(int inputCount, double learningRate)
    {
        this.valueMatrix = new double[inputCount];
        this.weightMatrix = new double[inputCount];
        // generate random values for weights at the first
        for (int i = 0; i < inputCount; i++)
        {
            this.weightMatrix[i] = Math.random();
        }
        this.bias = Math.random();
        this.learningRate = learningRate;

    }

    public void feedForward(double[] valueMatrix)
    {
        this.valueMatrix = valueMatrix;
        double sum = 0;
        for (int i=0; i < this.valueMatrix.length; i++)
        {
            sum += this.valueMatrix[i]*this.weightMatrix[i];

        }
        sum += this.bias;
        this.output = sum;

    }

    public void backProp(double target)
    {
        double error = target - this.output;

        for (int i = 0; i<this.weightMatrix.length; i++)
        {
            this.weightMatrix[i] = this.weightMatrix[i] + this.learningRate*error*this.valueMatrix[i];
        }
        this.bias += this.learningRate * error;
    }

    public double getOutput() 
    {
        return output;
    }
    

 
}
