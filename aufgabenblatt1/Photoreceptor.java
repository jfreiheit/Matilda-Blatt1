package matilda.aufgabenblatt1;

public class Photoreceptor extends Neuron
{
	public String type;
	
	public Photoreceptor(int index, String type) throws IllegalArgumentException
	{
		super(index);
		if(type=="green" || type=="blue" || type=="red")
		{
			this.type = type;
		}
		else
		{
			throw new IllegalArgumentException("wrong type");
		}
	}
	
	@Override
	public void addSynapse(Synapse synapse) throws IllegalArgumentException
	{
		if(this.outgoingsynapses.size() < 1)
		{
			super.addSynapse(synapse);
		}
		else
		{
			throw new IllegalArgumentException("not more than one synapse possible");
		}
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
