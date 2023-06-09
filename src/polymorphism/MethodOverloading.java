package polymorphism;

public class MethodOverloading {
	
	public void add()
	{
		int a=10,b=20;
		System.out.println(a+b);
	}
	public int add(int a,int b)
	{
		return a+b;
	}
	public int add(int a,int b,int c)
	{
		return a+b+c;
	}
	public double add(double a,int b)
	{
		return a+b;
		
	}
	public double add(int b,double a)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloading o = new MethodOverloading();
		o.add();
		int add3 = o.add(50, 100);
		System.out.println(add3);
		double add = o.add(98.99,1);
		System.out.println(add);
		o.add(100, 50, 150);
		double add2 = o.add(1, 98.9);
		System.out.println(add2);
	}

}
