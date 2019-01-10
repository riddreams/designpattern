package builder;

import java.util.ArrayList;

/**
 * @author lwyan on 2018-11-28 11:06
 */
public class BMWBuilder extends CarBuilder {
	private BMWModel bmw = new BMWModel();
	public CarModel getCarModel() {
		return this.bmw;
	}
	public void setSequence(ArrayList<String> sequence) {
		this.bmw.setSequence(sequence);
	}
}