package factorymethod;
/**
* @author Xin Chen
* @email cxscy@126.com
* @date 2018-08-10
* @version 1.0
* @Description
*/
public class ConcreteCreator implements Creator {

	@Override
	public <T extends Product> T createProduct(Class<T> cls) {
		T product=null;
		try {
			product=cls.newInstance();
		} catch (InstantiationException e) {
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			e.printStackTrace();
		}
		return product;
	}
}
