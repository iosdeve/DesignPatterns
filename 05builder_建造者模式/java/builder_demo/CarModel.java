package builder_demo;

import java.util.List;

public abstract class CarModel {
 
	private List sequence;
	 
	protected abstract void start();
	protected abstract void stop();
	protected abstract void alarm();
	protected abstract void engineBoom();
	public void run() {
	 
	}
	 
	public void setSequence(List sequence) {
	 
	}
	 
}
 
