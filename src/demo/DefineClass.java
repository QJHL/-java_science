package demo;

public class DefineClass {
	public static void main(String[] args) {
		Children child=new Children();
		child.eat();
	}
	
	public class man implements Person{

		@Override
		public void eat() {
			// TODO Auto-generated method stub
			
		}
		
	}
	
	public interface Adress{
		
	}
}

interface Person{
	void eat();
}

class Children implements Person{

	public void eat() {
		System.out.println("same file class");
	}
	
}