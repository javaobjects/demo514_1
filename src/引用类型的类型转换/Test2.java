package 引用类型的类型转换;

public class Test2 {

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
		 * 调用相同的方法，其行为是不一样的行为
		 * 
		 */
	}
}
