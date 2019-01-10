package singleton;

/**
 * @author lwyan on 2018-07-27 10:50
 */
public class Minister {
	public static void main(String[] args){
		Emperor emperor1 = Emperor.getEmperor();
		Emperor emperor2 = Emperor.getEmperor();
		System.out.println(emperor1 == emperor2);
	}
}