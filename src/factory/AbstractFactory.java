package factory;

/**
 * 抽象工厂
 * @author lwyan on 2018-11-28 9:40
 */
public abstract class AbstractFactory {
	// 生产图形
	public abstract Shape createShape(Class clazz);
}