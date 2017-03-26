
class State<S> {
    public final S s;

    public State(S s) {
        this.s = s;
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public State<String> saveState() {
        return new State(name);
    }
    public void recoveryState(State<String> state) {
        name = state.s;
    }
    @Override
    public String toString() {
        return name;
    }
}


public class Memento {

    public static void main(String[] args) {
        Person p = new Person("abc");
        System.out.println(p);
        State s = p.saveState();
        p.setName("xyz");
        System.out.println(p);
        p.recoveryState(s);
        System.out.println(p);
    }

}
