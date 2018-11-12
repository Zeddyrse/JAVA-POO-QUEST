package programationquest;

public class Boat extends Vehicle{
	
	public Boat(int kilometers, String brand) {
		super(kilometers, brand);
		
	}
	
	@Override
	public String doStuff() {
		return ("glou glou !");
	}	
}
