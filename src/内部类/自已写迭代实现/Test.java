package 内部类.自已写迭代实现;

public class Test {

	public static void main(String[] args) {

		MyList list = new MyList();
		
		list.add("zhangsan");
		list.add("lisi");
		list.add("telangpu");
		
		MyIteratorIfac it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
