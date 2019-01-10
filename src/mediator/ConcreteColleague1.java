package mediator;

/**
 * @author lwyan on 2018-11-29 10:10
 */
public class ConcreteColleague1 extends Colleague {
	//通过构造函数传递中介者
	public ConcreteColleague1(Mediator mediator){
		super(mediator);
	}
	//自有方法 self-method
	public void selfMethod1(){
		//处理自己的业务逻辑
		System.out.println("ConcreteColleague1 do selfMethod1");
	}
	//依赖方法 dep-method
	public void depMethod1(){
		//处理自己的业务逻辑
		//自己不能处理的业务逻辑，委托给中介者处理
		super.mediator.doSomething1();
	}
}