package demo;

public class Demo1 {

	
	public static void main(String[] args) {
		Demo1 demo=new Demo1();
		demo.resultTest();
		Double d=1D;
		long q=5L;
		int w=3;
		q=w;
	}
	
	/**
	 * java中只有整型才能使用的运算符？
	 * 	+,*,%,/
	 */
	public void resultTest() {
		float a=12.4f,b=3.2f;
		System.out.println((float)a*(float)b);
		System.out.println((float)a/(float)b);
		System.out.println((float)a%(float)b);
		System.out.println((float)a+(float)b);
		
	}
	public void method1() {}
}
