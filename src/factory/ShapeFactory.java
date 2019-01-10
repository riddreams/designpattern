package factory;

/**
 * 图形工厂
 * @author lwyan on 2018-06-05 11:29
 */
public class ShapeFactory extends AbstractFactory{
	@Override
	public Shape createShape(Class clazz) {
		Shape shape = null;
		try{
			shape = (Shape) Class.forName(clazz.getName()).newInstance();
		}catch (Exception e){
			e.printStackTrace();
		}
		return shape;
	}
}