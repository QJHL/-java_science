package demo;

public class Constuctor2 extends Constructor1 {

	{
		System.out.println("===========构造函数之前=============");
	}

	public Constuctor2(String s) {
		System.out.println("_________" + s);

	}

	{
		System.out.println("===========构造函数之后=============");
	}

	public static void main(String[] args) {
		new Constuctor2("ww");
	}
}
