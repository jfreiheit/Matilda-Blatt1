package matilda.aufgabenblatt1;

public class CorticalNeuron extends Neuron
{
	public double[] signal;
	
	public CorticalNeuron(int index)
	{
		super(index);
		this.signal = new double[0];
	}
	
	@Override
	public double[] integrateSignal(double[] signal)
	{
		return new double[0];
	}
	
	public double[] getSignal()
	{
		return this.signal;
	}
	
	public void reset()
	{
		this.signal = new double[0];
	}
}
