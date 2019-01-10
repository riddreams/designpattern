package mediator;

/**
 * @author lwyan on 2018-11-29 10:10
 */
public abstract class Colleague {
	protected Mediator mediator;
	public Colleague(Mediator mediator){
		this.mediator = mediator;
	}
}