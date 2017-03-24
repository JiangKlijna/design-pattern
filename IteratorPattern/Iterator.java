
import java.util.Arrays;
import java.util.LinkedHashSet;

class Artascope<T> implements Iterable<T> {
    private LinkedHashSet<T> colors = new LinkedHashSet<T>();

    public void addColor(T color) {
        colors.add(color);
    }

    public void addColor(T... cs) {
        colors.addAll(Arrays.asList(cs));
    }

    public void removeColor(T color) {
        colors.remove(color);
    }

    public void removeColor(T... cs) {
        colors.removeAll(Arrays.asList(cs));
    }

    @Override
    public java.util.Iterator<T> iterator() {
        return colors.iterator();
    }
}

public class Iterator {

    public static void main(String[] args) {
        Artascope<String> a = new Artascope<String>();
        a.addColor("red");
        a.addColor("green", "blue");
        a.removeColor("red");
        for (String color : a) System.out.println(color);
    }
}
