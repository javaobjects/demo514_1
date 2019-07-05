package super关键字;

public class Test {

	public static void main(String[] args) {

		//实例化Consumer，并给username属性赋值
		Consumer c = new Consumer("zhangsan");
//		c.setUsername("zhangsan");
		System.out.println(c.getUsername());
		
	}

}
