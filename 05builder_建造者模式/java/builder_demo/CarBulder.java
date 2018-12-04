package builder_demo;

import java.util.List;

public abstract class CarBulder {
 
	private CarModel carModel;
	 
	public abstract void setSequence(List sequence);
	public abstract CarModel getCarModel();
}
 
