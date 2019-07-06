package static关键字;

public class Test {

	public static void main(String[] args) {

		Order o1 = new Order();
		
		Order o2 = new Order();
		
		Order o3 = new Order();
		
		System.out.println(Order.count);//3
		System.out.println(o1.count);//3
		System.out.println(o2.count);//3
		System.out.println(o3.count);//3
		
		Order.sort(new Order[3]);//sort(Order[] orders)
		o1.sort(new Order[3]);//sort(Order[] orders)
		o2.sort(new Order[3]);//sort(Order[] orders)
		o3.sort(new Order[3]);//sort(Order[] orders)
	}
}
