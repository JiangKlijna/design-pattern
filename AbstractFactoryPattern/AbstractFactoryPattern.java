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

	// 使用 getShape 方法获取形状类型的对象
	public Shape getShape(int type) {
		if (type == Circle) {
			return new Circle();
		} else if (type == Rectangle) {
			return new Rectangle();
		} else if (type == Square) {
			return new Square();
		}
		return null;
	}
}

interface Color {
	void fill();
}

class Red implements Color {

	@Override
	public void fill() {
		System.out.println("Red::fill() method.");
	}
}

class Green implements Color {

	@Override
	public void fill() {
		System.out.println("Green::fill() method.");
	}
}

class Blue implements Color {

	@Override
	public void fill() {
		System.out.println("Blue::fill() method.");
	}
}

class ColorFactory {
	public static final int Red = 3;
	public static final int Green = 4;
	public static final int Blue = 5;

	Color getColor(int color) {
		if (color == Red) {
			return new Red();
		} else if (color == Green) {
			return new Green();
		} else if (color == Blue) {
			return new Blue();
		}
		return null;
	}
}

class FactoryProducer {
	public static final int Color = 6;
	public static final int Shape = 7;

	public static Object getFactory(int choice) {
		if (choice == Shape) {
			return new ShapeFactory();
		} else if (choice == Color) {
			return new ColorFactory();
		}
		return null;
	}
}

public class AbstractFactoryPattern {
	public static void main(String[] args) {
		ColorFactory colorfactory = (ColorFactory) FactoryProducer.getFactory(FactoryProducer.Color);
		// Red
		Color color1 = colorfactory.getColor(ColorFactory.Red);
		color1.fill();

		// Green
		Color color2 = colorfactory.getColor(ColorFactory.Green);
		color2.fill();

		// Blue
		Color color3 = colorfactory.getColor(ColorFactory.Blue);
		color3.fill();

		ShapeFactory shapefactory = (ShapeFactory) FactoryProducer.getFactory(FactoryProducer.Shape);
		// Circle
		Shape shape1 = shapefactory.getShape(ShapeFactory.Circle);
		shape1.draw();

		// Square
		Shape shape2 = shapefactory.getShape(ShapeFactory.Square);
		shape2.draw();

		// Rectangle
		Shape shape3 = shapefactory.getShape(ShapeFactory.Rectangle);
		shape3.draw();
	}
}