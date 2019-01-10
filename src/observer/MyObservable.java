package observer;

import java.util.Observable;

/**
 * @author lwyan on 2018-12-04 12:08
 */
public class MyObservable extends Observable{
	public void doSomething(){
		System.out.println("被观察者做了某事");
		this.setChanged();
		this.notifyObservers();
	}
}