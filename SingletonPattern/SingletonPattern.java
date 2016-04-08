/**
 * @author jiang
 */

class Singleton {
	private Singleton() {
	}

	private static final Singleton mSingleton = new Singleton();

	public static Singleton getIntance() {
		return mSingleton;
	}

	public void show() {
		System.out.println("Singleton::show() method");
	}
}

public class SingletonPattern {
	public static void main(String[] args) {
		Singleton.getIntance().show();
	}
}