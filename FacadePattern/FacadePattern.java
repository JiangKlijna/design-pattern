/**
 * @author jiang
 */
interface Shape {
	void draw();
}

class Rectangle implements Shape {

	@Override
	public void draw() {
		System.out.println("Rectangle::draw()");
	}
}

class Square implements Shape {

	@Override
	public void draw() {
		System.out.println("Square::draw()");
	}
}

class Circle implements Shape {

	@Override
	public void draw() {
		System.out.println("Circle::draw()");
	}
}

class ShapeMaker {
	private final Shape circle;
	private final Shape rectangle;
	private final Shape square;

	public ShapeMaker() {
		circle = new Circle();
		rectangle = new Rectangle();
		square = new Square();
	}

	public void drawCircle() {
		circle.draw();
	}

	public void drawRectangle() {
		rectangle.draw();
	}

	public void drawSquare() {
		square.draw();
	}
}

public class FacadePattern {

	public static void main(String[] args) {
		ShapeMaker shapeMaker = new ShapeMaker();

		shapeMaker.drawCircle();
		shapeMaker.drawRectangle();
		shapeMaker.drawSquare();
	}

}
