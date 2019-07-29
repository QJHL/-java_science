package jdk8.method;

import java.util.function.Function;

@FunctionalInterface
public interface Person {


	default void eat() {
		System.out.println("�˶�Ҫ�Է�������");
	}


	public static void sleep() {
		System.out.println("�˶�Ҫ˯��������");
	}
	
	void function();
	
}
