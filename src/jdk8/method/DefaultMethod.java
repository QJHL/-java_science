package jdk8.method;

public class DefaultMethod {

	public static void main(String[] args) {
		Person person = new Person() {
			@Override
			public void function() {
			}
		};
		Person person2=()->System.out.println("接口实现");
		person2.eat();
		person2.function();
		person.eat();
		Person.sleep();
	}
}
