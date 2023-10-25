package javaPractice;

class SingleTonPattern {

	private static SingleTonPattern instance = null;

	private SingleTonPattern() {

	}

	public static SingleTonPattern getInstance() {

		if (instance == null) {
			instance = new SingleTonPattern();
		}

		return instance;

	}

}

public class CallSingleTonClassInstance {
	public static void main(String[] args) {

		SingleTonPattern obj1 = SingleTonPattern.getInstance();
		SingleTonPattern obj2 = SingleTonPattern.getInstance();
		SingleTonPattern obj3 = SingleTonPattern.getInstance();

		System.out.println(obj1 == obj2);
		System.out.println(obj2 == obj3);
		System.out.println(obj3 == obj1);

	}
}