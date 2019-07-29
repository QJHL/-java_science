package jdk8.lambda;

import java.util.Arrays;
import java.util.List;

/**
 * 
 * 
 * @author liubin 2019年7月24日
 */
public class ForeachDemo {
	public static void main(String[] args) {
		List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7);
		list.forEach(i -> {
			i = i + 2;
			System.out.println(i);
		});
		list.forEach(i -> System.out.println(i));
	}
}
