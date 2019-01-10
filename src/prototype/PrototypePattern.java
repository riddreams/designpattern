package prototype;

/**
 * @author lwyan on 2018-11-29 9:28
 */
public class PrototypePattern {
	public static void main(String[] args){
		PrototypeClass prototypeClass = new PrototypeClass();
		PrototypeClass cloneClass = prototypeClass.clone();
		System.out.print(cloneClass == prototypeClass);
	}
}