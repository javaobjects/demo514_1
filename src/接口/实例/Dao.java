package 接口.实例;

public class Dao implements D {//一个类可以实现多个接口，多个接口 之间用,号隔开

	/* (non-Javadoc)  
	 * <p>Title: add</p>  
	 * <p>Description: </p>    
	 * @see 接口.实例.DaoIfac#add()  
	 */
	@Override
	public void add () {
		System.out.println("add()");
	}
	
	/* (non-Javadoc)  
	 * <p>Title: delete</p>  
	 * <p>Description: </p>    
	 * @see 接口.实例.DaoIfac#delete()  
	 */
	@Override
	public  void delete() {
		System.out.println("delete()");
	}
	
	/* (non-Javadoc)  
	 * <p>Title: update</p>  
	 * <p>Description: </p>    
	 * @see 接口.实例.DaoIfac#update()  
	 */
	@Override
	public void update() {
		System.out.println("update()");
	}
}
