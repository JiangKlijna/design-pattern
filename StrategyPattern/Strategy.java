
interface Strategy {
	public int doOperation(int num1, int num2);
}

class OperationAdd implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 + num2;
	}
}

class OperationSubstract implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 - num2;
	}
}

class OperationMultiply implements Strategy {
	@Override
	public int doOperation(int num1, int num2) {
		return num1 * num2;
	}
}

class Context {
	private Strategy strategy;

	public Context(Strategy strategy) {
		this.strategy = strategy;
	}

	public int executeStrategy(int num1, int num2) {
		return strategy.doOperation(num1, num2);
	}
}

public class Strategy {

	public static void main(String[] args) {
		Context c1 = new Context(new OperationAdd());
		System.out.println("10 + 5 = " + c1.executeStrategy(10, 5));

		Context c2 = new Context(new OperationSubstract());
		System.out.println("10 - 5 = " + c2.executeStrategy(10, 5));

		Context c3 = new Context(new OperationMultiply());
		System.out.println("10 * 5 = " + c3.executeStrategy(10, 5));
	}

}
