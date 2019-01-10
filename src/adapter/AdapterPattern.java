package adapter;

/**
 * @author lwyan on 2018-12-04 9:55
 */
public class AdapterPattern {
	public static void main(String[] args){
		Target target = new ConcreteTarget();
		target.request();
		Target target1 = new Adapter();
		target1.request();
	}
}