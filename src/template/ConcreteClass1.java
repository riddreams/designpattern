package template;

/**
 * @author lwyan on 2018-11-28 10:20
 */
public class ConcreteClass1 extends AbstractClass{
	@Override
	protected void doSomething() {
		System.out.println("class1 do something.");
	}

	@Override
	protected void doAnything() {
		System.out.println("class1 do anything.");
	}
}