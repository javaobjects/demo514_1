package 抽象类;
/**
 * OrderDao对Order进行增删改查（CRUD）的方法
* <p>Title: OrderDao</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月6日
 */
public abstract class OrderDao {//abstract抽象

	/**
	 * 1.抽象类中可以没有抽象方法
	 * 
	 * 2.如果一个类中有抽象方法，那么这个类必须是抽象类
	 * 
	 * 3.如果子类没有实现该抽象方法，那么子类也必须声明为抽象类
	 * 
	 * 4.
	 */
	public abstract void getOrder();
	
	
}
