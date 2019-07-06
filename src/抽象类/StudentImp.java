package 抽象类;

public class StudentImp implements StudentInterface {

	/**
	 * 一个类如果实现接口必须实现接口里的所有方法
	 * 如果一个类里有未实 现接口的方法那么只有abstract
	 * 
	 * 加咯abstract会带来一个新的问题
	 * 这个类是不能被实例化的，除非它再生一个子类
	 */
	@Override
	public void addStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteStudent() {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateStudent() {
		// TODO Auto-generated method stub

	}

}
