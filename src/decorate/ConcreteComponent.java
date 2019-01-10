package decorate;

/**
 * @author lwyan on 2018-12-03 10:05
 */
public class ConcreteComponent extends Component{
	@Override
	public void operate() {
		System.out.println("concrete component");
	}
}