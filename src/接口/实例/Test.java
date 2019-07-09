package 接口.实例;

public class Test {

	public static void main(String[] args) {
		Service s = new Service();
		
		DaoIfac dao = new Dao();
		
		s.setDao(dao);
		
		s.register();
	}
}
