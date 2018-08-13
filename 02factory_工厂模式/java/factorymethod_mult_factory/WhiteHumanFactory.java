package factorymethod_mult_factory;

public class WhiteHumanFactory implements HumanFactory {
 
	public Human createHuman() {
		return new WhiteHuman();
	}
	 
}
 
