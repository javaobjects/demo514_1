package 内部类.现象一;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		
		//MyList list = new MyList();
		/**
		 * list.add("");
		 * 
		 * MyIterator it = list.iterator();
		 */
		
		
		list.add("zhangsan");
		list.add("lisi");
		list.add("wangwu");
		
		Iterator<String> it = list.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}

}
