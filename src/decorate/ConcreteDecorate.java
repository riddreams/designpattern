package decorate;

/**
 * @author lwyan on 2018-12-03 10:08
 */
public class ConcreteDecorate extends Decorate{
	public ConcreteDecorate(Component component) {
		super(component);
	}
	private void method(){
		System.out.println("concrete decorate");
	}
	@Override
	public void operate(){
		this.method();
		super.operate();
	}
}