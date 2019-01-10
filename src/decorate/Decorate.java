package decorate;

/**
 * @author lwyan on 2018-12-03 10:06
 */
public abstract class Decorate extends Component{
	private Component component;
	public Decorate(Component component){
		this.component = component;
	}
	@Override
	public void operate(){
		this.component.operate();
	}
}