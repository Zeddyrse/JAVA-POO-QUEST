package programationquest;

public class Hangar {

	public static void main(String[] args) {
		Car voiture = new Car(150, "Clio");
		Boat bateau = new Boat(90,"Titanic");
		
		System.out.println("Je suis une "+ voiture.getBrand() + " et je fais " + voiture.doStuff());
		
		
		System.out.println("Je suis le "+ bateau.getBrand() + " et je fais " + bateau.doStuff());

	}

}
