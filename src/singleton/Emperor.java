package singleton;

/**
 * 单例模式：确保某一个类只有一个实例，而且自行实例化并向整个系统提供这个实例
 * @author lwyan on 2018-07-27 10:47
 */
// 饿汉式的单例模式，无线程安全问题，但是未延迟加载，可以使用
/*
public class Emperor {
    // 直接加载实例
	private static final Emperor emperor = new Emperor();
	// 单例模式，构造方法私有化
	private Emperor(){

	}
	// 向系统提供实例的方法
	public static Emperor getEmperor(){
		return emperor;
	}
	// 类中其他方法，尽量是static的
}
*/

// 线程安全的懒汉式单例模式（双重检查），进行延迟加载，推荐使用
public class Emperor{
	// 延迟加载
	private static volatile Emperor emperor;
	private Emperor(){}
	public static Emperor getEmperor(){
		if(emperor == null){
			// 加锁，避免线程安全问题
			synchronized (Emperor.class){
				if(emperor == null){
					// 加载实例
					emperor = new Emperor();
				}
			}
		}
		return emperor;
	}
}
