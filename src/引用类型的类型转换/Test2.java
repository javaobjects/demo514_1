package 引用类型的类型转换;

public class Test2 {

	/**
	 * 多态产生的条件：
	 * 要有继承，或 实现
	 * 要有重写
	 * 父类引用指向子类对象
	 * <p>Title: main</p>  
	 * <p>Description: </p>  
	 * @param args
	 */
	public static void main(String[] args) {
//这里不能调用cry()方法，因为将其上溯造型成咯Animal，
//Animal里有有 这方法才有，Animal里没有就 没有
//		Animal a = new Cat();
//		
//		Cat c = (Cat) a;//下溯造型
//		
//		c.cry();
		
		
		
		Animal a = new Animal();
		a.eat();
		Animal b = new Cat();
		b.eat();
		Animal c = new Dog();
		c.eat();
		/**
		 * 调用相同的方法，其行为是不一样的行为，这种行为叫做多态 
		 * 那么这种多态是由于什么原因造成的呢？
		 * 是由于第一发生咯继承
		 * 第二：子 类重写咯父类的方法
		 * 第三：父类引用指向子类实例
		 * 
		 */
	}
}
