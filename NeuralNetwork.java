import java.util.*;
public class NeuralNetwork {
	private int numInputs;
	private int numOutputs;
	private int numHiddenLayers;
	private int neuronsPerHiddenLayer;
	private Vector<NeuronLayer> vecLayers = new Vector<NeuronLayer>();
	public static void main(String[] args) throws InterruptedException{
	}
	public NeuralNetwork(){
		createNet();
	}
	public void createNet(){
		if(numHiddenLayers > 0){
			vecLayers.add(new NeuronLayer(neuronsPerHiddenLayer,numInputs));
			for(int i = 0; i < numHiddenLayers - 1; i++){
				vecLayers.add(new NeuronLayer(neuronsPerHiddenLayer,neuronsPerHiddenLayer));
			}
				vecLayers.add(new NeuronLayer(numOutputs,neuronsPerHiddenLayer));
		}
		else{
			vecLayers.add(new NeuronLayer(numOutputs,numInputs));
		}
	}
	public Vector<Double> update(Vector<Double> inputs){
		Vector<Double> outputs = new Vector<Double>();
		int weight = 0;
		if (inputs.size() != numInputs){
			return outputs;
		}
		for(int i = 0; i < numHiddenLayers + 1; i++){
			if(i > 0){
				inputs = outputs;
			}
			outputs.clear();
			weight = 0;
			for(int j = 0; j < vecLayers.get(i).numOfNeurons; ++j){
				double netInput = 0;
				int NumInputs = vecLayers.get(i).neurons.get(j).numOfInputs;
				for(int k = 0; k < numInputs - 1; ++k){
					netInput += vecLayers.get(i).neurons.get(j).weights.get(k) * -1;
				}
				outputs.add();
			}
		}
	}
}
