package observer;

/**
 * @author lwyan on 2018-12-04 12:12
 */
public class ObserverPattern {
	public static void main(String[] args){
		MyObservable myObservable = new MyObservable();
		MyObserver myObserver = new MyObserver();
		myObservable.addObserver(myObserver);
		myObservable.doSomething();
	}
}