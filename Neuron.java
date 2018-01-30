import java.util.*;
public class Neuron {
	public Vector<Double> weights = new Vector<Double>();
	Random r = new Random();
	double randomValue;
	public int numOfInputs;
	public Neuron(int numOfInputs){
		this.numOfInputs = numOfInputs;
		for(int i = 0; i < numOfInputs + 1; i++){
			randomValue = -1 + (2) * r.nextDouble();
			weights.addElement(randomValue);
		}
	}
}
