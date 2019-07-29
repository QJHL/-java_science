package thread;
public class Run1 {
	public static void main(String[] args) {
		Thread thread1 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("---------------Thread1:" + i);
			}
		});
		Thread thread2 = new Thread(() -> {
			for (int i = 0; i < 100; i++) {
				System.out.println("Thread2:" + i);
			}
		});
		System.out.println(thread1.getName());
		System.out.println(thread1.getPriority());
		System.out.println(thread1.getContextClassLoader());
		System.out.println(thread1.getState());
		System.out.println(thread1.getThreadGroup());
		/*thread1.start();
		thread2.start();*/
	}
}
