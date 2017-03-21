
abstract class Shape {

    abstract void draw();

    public static <T extends Shape> Shape getShape(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            return null;
        }
    }

}

class Rectangle extends Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method.");
    }
}

class Square extends Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw() method.");
    }
}

class Circle extends Shape {

    @Override
    public void draw() {
        System.out.println("Circle::draw() method.");
    }
}

public class Factory {

    public static void main(String[] args) {
        //Circle
        Shape shape1 = Shape.getShape(Circle.class);
        shape1.draw();

        //Rectangle
        Shape shape2 = Shape.getShape(Rectangle.class);
        shape2.draw();

        //Square
        Shape shape3 = Shape.getShape(Square.class);
        shape3.draw();
    }
}
