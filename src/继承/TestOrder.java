package 继承;

import 权限访问修饰符.Order;//因为不在同一个包中所以需要导包

public class TestOrder extends Order{

	Order order;
	
	public void getId() {
//		System.out.println(order.id);//public的可以访问
	}
	
	public static void main(String[] args) {
		TestOrder o = new TestOrder();
		System.out.println(o.id);//子类可以访问到父类中的protected属性
	}
}
