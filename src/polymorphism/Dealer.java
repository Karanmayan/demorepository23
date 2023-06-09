package polymorphism;

public class Dealer extends Factory{
	
	public void rangeRover()
	{
		System.out.println("THIS IS RANGEROVER DISCOVERY");
	}
	
	public void innova()
	{
		System.out.println("THIS IS TOYOTA INNOVA HYRIDER");
	}
	
	public static void main(String[] args) {
		Dealer o = new Dealer();
		o.innova();
		o.landCruiser();
		o.rangeRover();
		
		
		Factory a = new Factory();
		System.out.println( );
		System.out.println("OBJECT CREATION FOR FACTORY");
		a.innova();
		a.landCruiser();
		
		
		Factory b = new Dealer();
		System.out.println();
		System.out.println("CREATING OBJECT FOR DEALER AND ASSIGNING IT FACTORY");
		b.innova();
		
	}

}
