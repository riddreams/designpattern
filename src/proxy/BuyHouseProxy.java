package proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author lwyan on 2018-11-27 10:41
 */
public class BuyHouseProxy implements InvocationHandler{
	private Object target;
	public BuyHouseProxy(Object target){
		this.target = target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("找房付款");
		Object result =  method.invoke(target,args);
		System.out.println("装修入住");
		return result;
	}
}