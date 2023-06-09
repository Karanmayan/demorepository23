package abstraction;

public class Market extends Garden {

	@Override
	public void fruit() {
		System.out.println("APPLE");
		
	}
	public void dryFruits()
	{
		System.out.println("CASHEW NUT");
		System.out.println("BADAM");
	}
	public static void main(String[] args) {
		Market o = new Market();
		o.vegetable();
		o.fruit();
		o.dryFruits();
	}

}
