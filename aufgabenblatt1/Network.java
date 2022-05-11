package matilda.aufgabenblatt1;

public class Network {
	public int receptors;
	int cortical;
	Neuron[] neurons;
	String[] receptortypes;
	
	public Network(int inter, int receptors, int cortical)
	{
		
	}
	
	public void addSynapsen(Neuron n1, Neuron n2)
	{
		Synapse newSynapse = new Synapse(n1,n2);
		n1.addSynapse(newSynapse);
	}
	
	public double[] signalprocessing(double[] input)
	{
		return new double[0];
	}
	
	public String colors(double[] signal)
	{
		return "";
	}
	
	public double[] countColorreceptors()
	{
		return new double[0];
	}

}
