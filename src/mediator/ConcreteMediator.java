package mediator;

/**
 * @author lwyan on 2018-11-29 10:09
 */
public class ConcreteMediator extends Mediator {
	@Override
	public void doSomething1() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
	@Override
	public void doSomething2() {
		super.c1.selfMethod1();
		super.c2.selfMethod2();
	}
}