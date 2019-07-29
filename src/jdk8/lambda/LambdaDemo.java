package jdk8.lambda;

public class LambdaDemo {

	private interface NumberOprator {
		public abstract int addNumber(int a, int b);
	};

	private interface NumberAbs {
		public abstract int abs(int a);
	}

	static NumberOprator numberOper1 = (int a, int b) -> {
		return a + b;
	};
	NumberOprator numberOprator2 = (a, b) -> a + b;
	static NumberAbs numberAbs = a -> {
		if (a < 0) {
			a = a * -1;
		}
		return a;
	};

	private void methodtest(int a, int b, NumberOprator numberOper, NumberAbs numberAbs) {
		System.out.println(numberOper.addNumber(a, b));
		System.out.println(numberAbs.abs(a));
	}

	public static void main(String[] args) {
		System.out.println(numberAbs.abs(-6));
		LambdaDemo lam = new LambdaDemo();
		lam.methodtest(-3, 5, numberOper1, numberAbs);

	}
}
