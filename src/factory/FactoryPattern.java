package factory;

/**
 * @author lwyan on 2018-06-05 11:34
 */
public class FactoryPattern {
	public static void main(String[] args){
		AbstractFactory factory = new ShapeFactory();

		Shape shape = factory.createShape(Circle.class);
		shape.draw();

		shape = factory.createShape(Rectangle.class);
		shape.draw();

		shape = factory.createShape(Square.class);
		shape.draw();
	}
}