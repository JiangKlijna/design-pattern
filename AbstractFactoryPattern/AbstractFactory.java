
interface Shape {
    void draw();
}

class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Rectangle::draw() method");
    }
}

class Square implements Shape {

    @Override
    public void draw() {
        System.out.println("Square::draw() method");
    }
}

class ShapeFactory {

    public <T extends Shape> T getShape(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}

interface Color {
    void fill();
}

class Red implements Color {

    @Override
    public void fill() {
        System.out.println("Red::fill() method");
    }
}

class Blue implements Color {

    @Override
    public void fill() {
        System.out.println("Blue::fill() method");
    }
}

class ColorFactory {

    public <T extends Color> T getColor(Class<T> cls) {
        try {
            return cls.newInstance();
        } catch (Exception e) {
            return null;
        }
    }
}

class FactoryProducer {
    public enum type {
        Color, Shape
    }

    public static <T> T getFactory(type choice) {
        switch (choice) {
            case Color:
                return (T) new ColorFactory();
            case Shape:
                return (T) new ShapeFactory();
            default:
                return null;
        }
    }
}

public class AbstractFactory {

    public static void main(String[] args) {
        ColorFactory colorfactory = FactoryProducer.getFactory(FactoryProducer.type.Color);
        // Red
        colorfactory.getColor(Red.class).fill();
        // Blue
        colorfactory.getColor(Blue.class).fill();

        ShapeFactory shapefactory = FactoryProducer.getFactory(FactoryProducer.type.Shape);
        // Square
        shapefactory.getShape(Square.class).draw();
        // Rectangle
        shapefactory.getShape(Rectangle.class).draw();
    }

}
