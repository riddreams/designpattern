package proxy;

import java.lang.reflect.Proxy;

/**
 * @author lwyan on 2018-11-27 10:43
 */
public class Client {
	public static void main(String[] args){
		BuyHouse buyHouseProxy = (BuyHouse) Proxy.newProxyInstance(BuyHouse.class.getClassLoader(),
				BuyHouseImpl.class.getInterfaces(),new BuyHouseProxy(new BuyHouseImpl()));
		buyHouseProxy.buyHouse();
	}
}