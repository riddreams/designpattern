package observer;

import java.util.Observable;
import java.util.Observer;

/**
 * @author lwyan on 2018-12-04 12:10
 */
public class MyObserver implements Observer {
	@Override
	public void update(Observable o, Object arg) {
		System.out.println("观察者观察到被观察者做了某事");
	}
}