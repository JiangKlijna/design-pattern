
class Age {
    public int age;

    public Age(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Age{" + "age=" + age + '}';
    }
}

class Name {
    public String name;

    public Name(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Name{" + "name='" + name + '\'' + '}';
    }
}

class Person {
    public final Age age;
    public final Name name;

    public Person(int age, String name) {
        this.age = new Age(age);
        this.name = new Name(name);
    }

    @Override
    public String toString() {
        return "Person{" + "age=" + age + ", name=" + name + '}';
    }
}

public class Composite {

    public static void main(String[] args) {
        Person p = new Person(18, "zhangsan");
        System.out.println(p);
        Age a = p.age;
        Name n = p.name;
        a.age = 20;
        System.out.println(p);
        n.name = "lisi";
        System.out.println(p);
    }
}
