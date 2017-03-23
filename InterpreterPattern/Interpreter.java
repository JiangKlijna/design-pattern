
import java.util.regex.Pattern;

class Expression {
    private static final Pattern pattern = Pattern.compile("^[a-z]:.+$");

    public boolean interpret(String str) {
        if (pattern.matcher(str).matches()) {
            try {
                String[] kv = str.split(":");
                switch (kv[0]) {
                    case "p":
                        return p(kv[1]);
                    case "e":
                        return e(kv[1]);
                    default:
                        return false;
                }
            } catch (Exception e) {
                return false;
            }
        } else {
            return false;
        }
    }

    private boolean p(String value) {
        System.out.println(value);
        return true;
    }

    private boolean e(String value) {
        System.err.println(value);
        return true;
    }
}

public class Interpreter {

    public static void main(String[] args) {
        Expression e = new Expression();
        e.interpret("p:jiang");
        e.interpret("e:abc");
    }

}
