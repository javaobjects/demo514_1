package 引用类型的类型转换;

public class Dog extends Animal {

	public void showName() {
		System.out.println("一只Dog");
	}
	
	@Override
	public void eat() {
//		super.eat();
		System.out.println("eat 骨头。。。");
	}
}
