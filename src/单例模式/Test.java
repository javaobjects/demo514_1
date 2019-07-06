package 单例模式;

public class Test {

	public static void main(String[] args) {
		//需求：生成订单对象，然后不管调用多少次构造方法，
		//内存中只有一个实例存在
		for (int i = 0; i < 10; i++) {
			Order o = Order.getInstance();//new Order();
		}
		System.out.println(Order.count);//上面若为new Order()则其值为10，
		                               //其目的为让其打印输出为1不是10
		
	}

}
