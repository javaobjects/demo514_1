package 继承;

public class Test {

	public static void main(String[] args) {

		/**
		 * 子类实例化的过程：一定先实例化父类
		 * 注意：如果子类中有初始化块，那么 
		 * 调用构造方法之前会先执行初始化块
		 * Object() --> Person() -->
		 *  Consumer() --> Student()
		 */
		Student stu = new Student(12,"zhangsan");
//		Person()
//		Consumer()
//		Student()

	}

}
