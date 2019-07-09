package 接口;

public interface MyInterface {

	int k = 4;//这个不是变量，是常量，这样写不规范
	
	public static final int K = 10;//这是正确的语法，其他几种语法虚拟机都给你过，但是其实最终形式是这个
	
	public int A = 100;
	
	static int B = 200;
	
	final int C = 300;
	
	
	abstract void a();
	
	static void b() {};
	
	default void c() {};
}
