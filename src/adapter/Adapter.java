package adapter;

/**
 * @author lwyan on 2018-12-04 9:55
 */
public class Adapter extends Adaptee implements Target{
	@Override
	public void request() {
		super.doSomething();
	}
}