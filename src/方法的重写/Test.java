package 方法的重写;

public class Test {

	public static void main(String[] args) {

		Fly bird = new Bird();
		bird.fly();//is flying....我是振翅高飞哟。。。。。
		
		
		//Bird b = new Fly(); //这样不行的。。
	}

}
