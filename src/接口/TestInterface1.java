package 接口;

/**
 * 接口
* <p>Title: TestInterface1</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月6日
 */
public interface TestInterface1 {

//	private int id;//代码报错不给过

//	public void setName() {
//		
//	}//代码也不让过。。。
	
	public static final String COMPANY_NAME = "TENCENT";//可以定义常量
	
	public void showName();//可以定义抽象方法
	
	public static void showId() {
		//可以定义静态方法
	}
	
	default void showMoney() {
		//定义默认方法ok
	}
}
