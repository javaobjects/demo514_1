package static关键字;

public class Order {
	
//	public static Order() {//static 不能修饰构造方法
//	 
//	}

	/**
	 * 所有静态变量，通过类名，变量名可以调用Order.count;
	 * 也可以通过该类的实例化对象来访问到o1.count;
	 */
	static int count = 0;//订单的数量
	public Order() {
		count++;
	}
	/**
	 * 类加载器将Order.class加载进内存时，
	 * 会执行静态初始化块，并且只执行一次
	 */
	static {
		System.out.println("static{}");
	}
	
	/**
	 * 所有静态方法，通过类名，方法名可以调用Order.sort();
	 * 也可以通过该类的实例化对象来访问到o1.sort();
	 */
	static void sort(Order[] orders) {
		
		//id++;//不行 static方法不能访问非静态属性
		//getId();//不行 static方法不能访问非静态方法
		System.out.println("sort(Order[] orders)");
	}
	
	private int id;//订单的单号

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
