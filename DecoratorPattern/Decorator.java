
interface Shape {
    void draw();
}

class Rectangle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Rectangle");
    }
}

class Circle implements Shape {

    @Override
    public void draw() {
        System.out.println("Shape: Circle");
    }
}

class Diamond implements Shape {
    @Override
    public void draw() {
        System.out.println("Shape: Diamond");
    }
}

class ShapeDecorator implements Shape {
    protected Shape decoratedShape;

    public ShapeDecorator(Shape decoratedShape) {
        this.decoratedShape = decoratedShape;
    }

    @Override
    public void draw() {
        decoratedShape.draw();
    }

    //对其他实现了Shape的类增加的功能
    public void draw(int size) {
        for (int i = 0; i < size; i++) decoratedShape.draw();
    }
}


public class Decorator {

    public static void main(String[] args) {
        Shape circle = new Circle();
        ShapeDecorator shapeDiamond = new ShapeDecorator(new Diamond());
        ShapeDecorator shapeRectangle = new ShapeDecorator(new Rectangle());

        circle.draw();
        shapeDiamond.draw(2);
        shapeRectangle.draw(3);
    }
}
