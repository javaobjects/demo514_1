package 单例模式;

public class Order {

	/**
	 * 单例模式实现的步骤：
	 * 1.构造器私有
	 * 2.提供私有的静态的当前类类型的变量
	 * 3.提供一个公共的静态方法，
	 * 返回刚才定义的变量，如果这个变量为null，
	 * 那么给他赋值
	 */
	private static Order order;
	
	public static Order getInstance() {
		if(order == null) {
			order = new Order();
		}
		return order;
	}
	
	private int id;
	static int count = 0;
	
	private Order() {
		count++;
	}
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Order [id=" + id + "]";
	}
	
}
