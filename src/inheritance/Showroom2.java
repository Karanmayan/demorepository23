package inheritance;

public class Showroom2 extends Distributor {
	
	public void displayTheBike()
	{
		System.out.println("DISPLAYING THE BIKE MODEL BULLET");
		
	}
	public static void main(String[] args) {
		Showroom2 o = new Showroom2();
		o.displayTheBike();
		o.motorCycle();
		o.bike();
	}

}
