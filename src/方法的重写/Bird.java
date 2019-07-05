package 方法的重写;

public class Bird extends Fly {

	@Override
	public void fly() {
		super.fly();
		System.out.println("我是振翅高飞哟。。。。。");
	}
}
