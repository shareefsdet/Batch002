package javaPractice;

class SingleTonPattern2 {

	private static SingleTonPattern2 instance = null;

	private SingleTonPattern2() {

	}

	public static SingleTonPattern2 getInstance() {

		if (instance == null) {
			instance = new SingleTonPattern2();
		}

		return instance;

	}

}

public class CallSingleTonClassInstance2 {
	public static void main(String[] args) {

		SingleTonPattern2 obj1 = SingleTonPattern2.getInstance();
		SingleTonPattern2 obj2 = SingleTonPattern2.getInstance();
		SingleTonPattern2 obj3 = SingleTonPattern2.getInstance();

		System.out.println(obj1 == obj2);
		System.out.println(obj2 == obj3);
		System.out.println(obj3 == obj1);

	}
}