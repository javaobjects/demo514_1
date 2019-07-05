package 引用类型的类型转换;

public class Test {

	public static void main(String[] args) {

		//第一种情况：
		Animal a = new Animal();
		
		//a.eat();
		
		//第二种情况：声明是Animal类型，实际赋值是Cat类型
		//上溯造型：把猫对象造型成Animal对象，然后再赋值给b引用
		Animal b = new Cat();//上溯造型，将子类类型赋值给父类变量
		b.eat();
		
		//第三种情况：
		Cat c = new Cat();
		c.eat();
		
		//第四种情况：
//		Cat d = new Dog();//这种报错，代码不让过
		
		//第五种情况：
//		Cat e = new Animal();//不可将父级赋值给子级
		
	}

}
