package 接口.实例;

public class Service {

	private DaoIfac dao;
	
	public DaoIfac getDao() {
		return dao;
	}
	
	public void setDao(DaoIfac dao) {
		this.dao = dao;
	}
	
	public void register() {
		dao.add();
	}
}
