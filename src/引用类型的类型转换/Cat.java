package 引用类型的类型转换;

public class Cat extends Animal {

	public void cry() {
		System.out.println("喵喵叫。。。。。");
	}
	
	@Override
	public void eat() {
//		super.eat();
		System.out.println("eat 鱼。。");
	}

}
