package adapter;

/**
 * @author lwyan on 2018-12-04 9:52
 */
public class ConcreteTarget implements Target{
	@Override
	public void request() {
		System.out.println("if you need any help, pls call me.");
	}
}