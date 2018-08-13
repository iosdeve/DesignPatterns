package factorymethod;
/**
* @author Xin Chen
* @email cxscy@126.com
* @date 2018-08-10
* @version 1.0
* @Description
*/
public interface Creator {
	public abstract <T extends Product> T createProduct(Class<T> cls);
}
