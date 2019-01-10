package template;

/**
 * @author lwyan on 2018-11-28 10:22
 */
public class ConcreteClass2 extends AbstractClass{
	@Override
	protected void doSomething() {
		System.out.println("class2 do something.");
	}

	@Override
	protected void doAnything() {
		System.out.println("class2 do anything.");
	}
}