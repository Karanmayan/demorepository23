package constructor;

public class DerivedClass extends SuperClass {
	
	public void motorCycle()
	{
		super . car();
		super . bike();
		System.out.println("THIS IS ROYAL ENFIELD HIMALAYAN");
		
	}
	public static void main(String[] args) {
		
		DerivedClass o = new DerivedClass();
		o.motorCycle();
	}

}
