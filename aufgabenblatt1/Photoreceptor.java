package matilda.aufgabenblatt1;

public class Photoreceptor extends Neuron
{
	public String type;
	
	public Photoreceptor(int index, String type)
	{
		super(index);
		this.type = type;
	}
	
	@Override
	public void addSynapse(Synapse synapse)
	{
		
	}
	
	public double[] Excitation(int wave)
	{
		return new double[0];
	}
	
	@Override
	public double[] integrateSignal(double[] signal)
	{
		return new double[0];
	}
}
