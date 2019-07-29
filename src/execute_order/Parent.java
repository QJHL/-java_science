package execute_order;

public class Parent {
	static {
		System.out.println("1");
	}
	{
		System.out.println("2");
	}
	public static Parent t1 = new Parent();
	public Parent() {
		System.out.println("构造函数");
	}
	{
		System.out.println("3");
	}
	


	


	public static void main(String[] args) {
		System.out.println("---------------------");
		Parent t2 = new Parent();
		System.out.println("---------------------");
		Parent t3 = new Parent();
		System.out.println("---------------------");
		Parent t4 = new Parent();
		System.out.println("---------------------");
		
	}
}
