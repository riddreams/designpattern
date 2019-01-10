package template;

/**
 * @author lwyan on 2018-11-28 10:18
 */
public abstract class AbstractClass {
	protected abstract void doSomething();
	protected abstract void doAnything();
	// final防止子类覆写
	public final void templateMethod(){
		this.doAnything();
		this.doSomething();
	}
}