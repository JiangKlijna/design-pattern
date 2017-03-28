
class Shape implements Cloneable {

    private int id;
    private String type;

    public Shape(int id, String type) {
        this.id = id;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Shape clone(int id, String type) {
        try {
            Shape s = (Shape) super.clone();
            s.setId(id);
            s.setType(type);
            return s;
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public Shape clone() {
        try {
            return (Shape) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }


    @Override
    public String toString() {
        return "Shape." + hashCode() + "{id=" + id + ", type='" + type + "\'}";
    }

}

public class Prototype {

    public static void main(String[] args) {
        Shape s1 = new Shape(1, "A");
        System.out.append(s1.toString()).append('\n')
                .append(s1.clone().toString()).append('\n')
                .append(s1.clone(2, "B").toString())
                .flush();
    }

}
