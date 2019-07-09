package 内部类;

public class OuterClass {

	private int id;
	private String name;
	
	//成员内部类
	private class InnerClass1{
		private int id;
		private String name;
	}
	//静态内部类，所有对象共享
	static class InnerClass2{
		
	}
	
	public void show() {
		//局部内部类
		class InnerClass3{
			
		}
	}
	
	
	
}
