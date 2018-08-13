package factorymethod_mult_factory;

public class YelloHumanFactory implements HumanFactory {
 
	public Human createHuman() {
		return new YelloHuman();
	}
	 
}
 
