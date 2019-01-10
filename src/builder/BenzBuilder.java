package builder;

import java.util.ArrayList;

/**
 * @author lwyan on 2018-11-28 11:05
 */
public class BenzBuilder extends CarBuilder {
	private BenzModel benz = new BenzModel();
	public CarModel getCarModel() {
		return this.benz;
	}
	public void setSequence(ArrayList<String> sequence) {
		this.benz.setSequence(sequence);
	}
}