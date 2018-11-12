package programationquest;

public abstract class Vehicle {
	private int kilometers;
	private String brand;
	
	
	public Vehicle(int kilometers, String brand) {
		this.kilometers = kilometers;
		this.brand = brand;
	}


	public int getKilometers() {
		return kilometers;
	}


	public void setKilometers(int kilometers) {
		this.kilometers = kilometers;
	}


	public String getBrand() {
		return brand;
	}


	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public abstract String doStuff();
}
	
