package decorate;

/**
 * @author lwyan on 2018-12-03 10:10
 */
public class DecoratePattern {
	public static void main(String[] args){
		Component component = new ConcreteComponent();
		component = new ConcreteDecorate(component);
		component.operate();
	}
}