package constructor;

public class ConstructorThis {
	
	public ConstructorThis()
	{
		this(10,20);
		int a = 10;
		System.out.println(a);
		
	}
	public ConstructorThis(int a,int b)
	{
		this("JAVA" , "PROGRAM");
		System.out.println(a+b);
	}
	public ConstructorThis(String a ,String b)
	{
		System.out.println(a+b);
	}
	
public static void main(String[] args) {
	ConstructorThis o = new ConstructorThis();
	
	
}
}
