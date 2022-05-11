package matilda.aufgabenblatt1;

public class Interneuron extends Neuron
{
	public Interneuron(int index)
	{
		super(index);
	}
	
	@Override
	public double[] integrateSignal(double[] signal)
	{
		return new double[0];
	}
}
