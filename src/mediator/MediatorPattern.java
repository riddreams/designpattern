package mediator;

/**
 * @author lwyan on 2018-11-29 10:15
 */
public class MediatorPattern {
	public static void main(String[] args){
		Mediator mediator = new ConcreteMediator();
		ConcreteColleague1 colleague1 = new ConcreteColleague1(mediator);
		ConcreteColleague2 colleague2 = new ConcreteColleague2(mediator);
		mediator.setC1(colleague1);
		mediator.setC2(colleague2);
		colleague1.selfMethod1();
		System.out.println("============================");
		colleague1.depMethod1();
		System.out.println("============================");
		colleague2.selfMethod2();
		System.out.println("============================");
		colleague2.depMethod2();
	}
}