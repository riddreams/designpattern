package template;

/**
 * @author lwyan on 2018-11-28 10:22
 */
public class Client {
	public static void main(String[] args){
		AbstractClass class1 = new ConcreteClass1();
		AbstractClass class2 = new ConcreteClass2();
		class1.templateMethod();
		class2.templateMethod();
	}
}