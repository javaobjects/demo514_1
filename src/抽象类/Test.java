package 抽象类;

public class Test {

	public static void main(String[] args) {
		//抽象类不被实例化
		//OrderDao dao = new OrderDao();
		//若非要实例化，那么可以实例化其子类
//		OrderDao dao1 = new OrderDaoImp1();
		OrderDao dao1 = new OrderSunzi();
		
		OrderDao dao2 = new OrderDaoImp2();
		
		
	}
}
