package super关键字;

public class Consumer extends Person {//这就表达继承
	//private String username;
	
	public Consumer() {
		System.out.println("Consumer()");
	}
	
	public Consumer(String username) {
//		this.setUsername(username);
		//可以调用父类构造器：实现给username属性赋值的目的
//		super(username);//调用父类构造器 使用super关键字不但可以访问父类构造器还可以访问父类属性父类行为
		super.username = username;//super关键字 可以访问父类的非私有属性
		super.walk();
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Consumer is walking....");
		System.out.println("Boss is dancing....");
	}
}
