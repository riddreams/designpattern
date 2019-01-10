package builder;

/**
 * @author lwyan on 2018-11-28 11:03
 */
public class Client {
	public static void main(String[] args) {
		Director director = new Director();
		director.getABenzModel().run();
		System.out.println("==============================");
		director.getBBenzModel().run();
		System.out.println("==============================");
		director.getCBMWModel().run();
		System.out.println("==============================");
		director.getDBMWModel().run();
	}
}