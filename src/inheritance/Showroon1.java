package inheritance;

public class Showroon1 extends Distributor {
	
	public void displayBike()
	{
		System.out.println("DISPLAYING THE BIKES");
	}
	public static void main(String[] args) {
		Showroon1 o = new Showroon1();
		o.displayBike();
		o.motorCycle();
		o.bike();
		
		
	}

}
