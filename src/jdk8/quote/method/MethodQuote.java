package jdk8.quote.method;

public class MethodQuote {

	public static int sum(int a, int b) {
		return a + b;
	}

	public int quoteMethod(int a, int b, TwoNumberAdd add) {
		return add.sum(a, b);
	}

	public static void main(String[] args) {
		MethodQuote methodQuote = new MethodQuote();
		int result = methodQuote.quoteMethod(12, 13, MethodQuote::sum);
		result = methodQuote.quoteMethod(12, 13, (a, b) -> a + b);
		System.out.println(result);
		
	}
}
