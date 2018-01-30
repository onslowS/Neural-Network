import java.util.*;
public class NeuronLayer {
	public int numOfNeurons;
	Vector<Neuron> neurons = new Vector<Neuron>();
	public NeuronLayer(int numNeurons, int NumofInputsPerNeuron){
		numOfNeurons = numNeurons;
		for (int i = 0; i < numNeurons; i++){
			neurons.add(new Neuron(NumofInputsPerNeuron));
		}
	}
}