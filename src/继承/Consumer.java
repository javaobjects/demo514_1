package 继承;

public class Consumer extends Person {//这就表达继承
	//private String username;
	
	public Consumer() {
		System.out.println("Consumer()");
	}
	
	public void walk() {
		System.out.println("Consumer is walking....");
		System.out.println("Boss is dancing....");
	}
}
