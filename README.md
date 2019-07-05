# 93-Java-Super关键字.md

现在有Person类Consumer类(继承Person类)和Test类，需求：实例化Consumer，并给username属性赋值

```
package super关键字;

public class Person {
	protected String username;//protected 子类可以访问到
	
	public Person(String username) {
		this.username = username;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public Person() {
		System.out.println("Person()");
	}
	public void walk() {
		System.out.println("person is walking.....");
	}
}
```

```
package super关键字;

public class Consumer extends Person {//这就表达继承
	//private String username;
	
	public Consumer() {
		System.out.println("Consumer()");
	}
	public Consumer(String username) {
		this.setUsername(username);
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Consumer is walking....");
		System.out.println("Boss is dancing....");
	}
}
```
```
package super关键字;

public class Test {

	public static void main(String[] args) {

		//实例化Consumer，并给username属性赋值
		Consumer c = new Consumer("zhangsan");//第二种
//		c.setUsername("zhangsan");//第一种
		System.out.println(c.getUsername());
	}
}
```

第三种方法：

```
package super关键字;

public class Consumer extends Person {//这就表达继承
	//private String username;
	
	public Consumer() {
		super();//这里有没有这个super()效果是一样的，因为子类实例化时一定是先实例化其父类，然后才实例化子类。
		System.out.println("Consumer()");
	}
	
//	public Consumer() {
//		super();
//	}
	public Consumer(String username) {
//		this.setUsername(username);
		//可以调用父类构造器：实现给username属性赋值的目的
//		super(username);//调用父类构造器 使用super关键字不但可以访问父类构造器还可以访问父类属性父类行为
		super.username = username;//super关键字 可以访问父类的非私有属性
		super.walk();
	}

	@Override
	public void walk() {
		super.walk();
		System.out.println("Consumer is walking....");
		System.out.println("Boss is dancing....");
	}
}
```

#### 总结：

**super关键字作用以及注意事项：**

1. super可以调用父类构造方法
2. 可以调用父类中子类可以访问的属性
3. 可以调用父类中子类可以访问的方法
4. super使用时,在同一个构造器中super()和this()不能同时出现
5. super(),调用父类构造方法，代码必须出现在第一行；

#### 拓展：

**super和this关键字的区别？**

+ super()

    + 作用：调用父类的构造器
    + 只能出现在子类的构造器中，且必须是第一行
    + super()中的参数，决定了调用父类哪个构造器
    + 如果子类构造器中没有出现super，那么编译器会默认加上super()，即调用父类的空构造器，如果父类没有空构造器，编译器提示错误。

+ this()
    + 作用：调用本类的构造器
    + 只能写在构造器的第一行

+ 在同一个构造器中super()和this()不能同时出现

+ super.
    + 指向父类的引用。
    + 通过关键字super我们可以指定子类在构造时调用父类的哪个构造器，达到先实例化父类然后实例化子类的目的。
    + 子类的构造器默认的调用父类无参构造器，即子类构造器中没有用super指明调用父类哪个构造器的话，实际上编译器会自动的在子类构造器第一行加入代码super( );

+ this.
    + 指向本类的引用。
    + 我们知道子类在实例化时必须调用父类的构造器，实际上有的子类构造器也可以先调用本类的其他构造器，然后再通过那个构造器调用父类的构造器
    + 无论是调用父类的构造器还是子类的构造器，最终都是找到最顶级的父类自上而下的实例化。只要中间环节有一个构造器没找到，这个子类就无法完成实例化。


**子类实例化的过程**

+ 使用默认的构造器
+ 在子类中的创建构造器 
    + 在子类中创建构造器时，必须调用父类的构造器
    + 子类可以在自己的构造器中使用super关键字来调用父类的构造器
    + 如果使用super关键字调用父类构造器，必须写在该子类构造器的第一行
    + **<span style="color:red;">如调用的是父类中无参的构造器，则可以不写super( )</span>**
    + 如果子类中调用了父类无参的构造器，而父类中没有无参构造器则系统编译出错

**以就就是我关于 *Java-Super关键字*  知识点的整理与总结的全部内容，[另附源码](https://github.com/javaobjects/demo514_1)**

==================================================================
#### 分割线
==================================================================

**博主为咯学编程：父母不同意学编程，现已断绝关系;恋人不同意学编程，现已分手;亲戚不同意学编程，现已断绝来往;老板不同意学编程,现已失业三十年。。。。。。如果此博文有帮到你欢迎打赏，金额不限。。。**

![](https://upload-images.jianshu.io/upload_images/5227364-e76764b127f255ed.png?imageMogr2/auto-orient/strip%7CimageView2/2/w/1240) 