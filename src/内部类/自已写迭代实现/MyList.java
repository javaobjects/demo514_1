package 内部类.自已写迭代实现;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义一个集合类
* <p>Title: MyList</p>  
* <p>Description: </p>  
* @author xianxian 
* @date 2019年7月9日
 */
public class MyList {

	private List list = new ArrayList<>();
	
	public void add(String str) {
		list.add(str);
	}
	
	//定义一个迭代方法
	public MyIterator iterator() {
		return new MyIterator();
	}
	
	//定义一个内部类
	private class MyIterator implements MyIteratorIfac{

		int index = 0;
		@Override
		public boolean hasNext() {
			if(index < list.size()) {
				return true;
			}else {
				return false;
			}
		}

		@Override
		public String next() {
			String s = (String)list.get(index);
			index++;
			return s;
		}
		
	}
}
