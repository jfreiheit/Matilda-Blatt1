package matilda.aufgabenblatt1;

import java.util.ArrayList;

public class Neuron {
	public int index;
	ArrayList<Synapse> outgoingsynapses;
	
	public Neuron(int index)
	{
		this.index = index;
		this.outgoingsynapses = new ArrayList<>();
	}
	
	public double[] integrateSignal(double[] signal)
	{
		return new double[0];
	}
	
	public void addSynapse(Synapse synapse)
	{
		this.outgoingsynapses.add(synapse);
	}
}
