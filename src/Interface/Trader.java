package Interface;

public class Trader implements Farmer1 {

	@Override
	public void vegetable() {
		System.out.println("ONION");
		System.out.println("TOMATO");
		
	}
	public void vegetables()
	{
		System.out.println("BRINJAL");
	}
	public static void main(String[] args) {
		Trader o = new Trader();
		o.vegetable();
		o.vegetables();
	}

}
