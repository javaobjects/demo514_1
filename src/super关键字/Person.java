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
   