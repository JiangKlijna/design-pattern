/**
 * @author jiang
 */
interface Shape {
	void draw();
}

class Rectangle implements Shape {
	@Override
	public void draw() {
		System.out.println("Rectangle::draw() method.");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw() method.");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw() method.");
	}
}

class ShapeFactory {
	public static final int Circle = 0;
	public static final int Square = 1;
	public static final int Rectangle = 2;

	public static Shape getShape(int type) {
		if (type == Circle) {
			return new Circle();
		} else if (type == Rectangle) {
			return new Rectangle();
		} else if (type == Square) {
			return new Square();
		}
		return null;
	}

	private ShapeFactory(){}
}

public class FactoryPattern {

	public static void main(String[] args) {
		//Circle
		Shape shape1 = ShapeFactory.getShape(ShapeFactory.Circle);
		shape1.draw();

		//Rectangle
		Shape shape2 = ShapeFactory.getShape(ShapeFactory.Rectangle);
		shape2.draw();

		//Square
		Shape shape3 = ShapeFactory.getShape(ShapeFactory.Square);
		shape3.draw();
	}

}