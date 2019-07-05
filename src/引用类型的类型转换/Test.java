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
		
		//第六种情况：
		//1.发生了上溯造型
		Animal f = new Dog();
		f.eat();
//		Dog g = f;//这里报错是因为Dog被上溯造型咯Animal，解决bug需要将已经上溯造型的f强制下溯造型
		//2.发生了下溯造型;发生的条件是原来被上溯造型过
//		Dog g = (Dog) f;//下溯造型
//		g.eat();
		
		
		//更好的写法
		
		Dog g = null;
		
		if(f instanceof Dog) {//如果f是Dog的实例才将其下溯造型
			g = (Dog) f;
		}
		g.eat();
		
		
		Animal h = new Animal();
		
		if(h instanceof Dog) {
			Dog k = (Dog) h;
		}
	}
}
