package singleton;
/**
* @author Xin Chen
* @email cxscy@126.com
* @date 2018-08-08
* @version 1.0
* @Description
*/
public class Singleton {
	private static final Singleton singleton=new Singleton();
	
	private Singleton() {
		
	}
	
	public static Singleton getSingleton() {
		return singleton;
	}
}
