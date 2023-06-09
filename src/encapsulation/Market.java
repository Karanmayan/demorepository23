package encapsulation;

public class Market {
public static void main(String[] args) {
	Garden o = new Garden();
	String vegetable = o.getVegetable();
	System.out.println(vegetable);
	o.setVegetable("TOMATO");
	String vegetable2 = o.getVegetable();
	System.out.println(vegetable2);
}
}
