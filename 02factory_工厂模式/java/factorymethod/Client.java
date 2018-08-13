package factorymethod;
/**
* @author Xin Chen
* @email cxscy@126.com
* @date 2018-08-10
* @version 1.0
* @Description
*/
public class Client {
	public static void main(String[] args) {
		Creator creator=new ConcreteCreator();
		Product p1=creator.createProduct(ConcreteProduct.class);
		System.out.println(p1);
	}
}
