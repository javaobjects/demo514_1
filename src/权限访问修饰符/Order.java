package 权限访问修饰符;

public class Order {//此处的public是不可修改的。。。若修改，代码报错不给过。。。

	public int id;
	
	protected void showId() {
		System.out.println(this.id);
	}
	private class Test{}
	protected class Student{};
}
