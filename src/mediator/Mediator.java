package mediator;

/**
 * @author lwyan on 2018-11-29 10:08
 */
public abstract class Mediator {
	//定义同事类
	protected ConcreteColleague1 c1;
	protected ConcreteColleague2 c2;
	//通过setter方法把同事类注入进来
	public void setC1(ConcreteColleague1 c1) {
		this.c1 = c1;
	}
	public void setC2(ConcreteColleague2 c2) {
		this.c2 = c2;
	}
	//中介者模式的业务逻辑
	public abstract void doSomething1();
	public abstract void doSomething2();
}