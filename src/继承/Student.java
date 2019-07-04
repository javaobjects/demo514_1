package 继承;

public class Student extends Consumer {

	//需求：所有student实例化之前都要写日志
	{
		//初始化块
		System.out.println("写日志。。。");
	}
	
	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//构造方法一
	public Student() {
//		System.out.println("写日志");
		System.out.println("Student()");
	}
	
	//构造方法二
	public Student(int id) {
//		System.out.println("写日志");
		System.out.println("Student(int id)");
		this.id = id;
	}
	//构造方法三
	public Student(int id,String name) {
//		System.out.println("写日志");
		System.out.println("Student(int id,String name)");
		this.id = id;
		this.name = name;
	}
}
