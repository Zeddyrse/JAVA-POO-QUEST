package programationquest;

public class Car extends Vehicle{
	
	public Car (int kilometers, String brand) {
		super(kilometers, brand);
	}
	
	@Override
	public String doStuff() {
		return ("vroum vroum !");
	}
}
