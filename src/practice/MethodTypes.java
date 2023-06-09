package practice;

public class MethodTypes {
	public void withParameters(int a,int b)
	{
		System.out.println("METHOD NAME WITH PARAMETERS");
		System.out.println(a+b);
	}
	
	public int withoutParametersWithReturnType()
	{
		System.out.println("withoutParametersWithReturnType");
		int a=20;
		int b=50;
		return a+b;
	}
	public int withParametersWithReturnType(int a,int b)
	{
		System.out.println("withParametersWithReturnType");
		return a+b;
	}
	{
		
	}
	public static void main(String[] args) {
		MethodTypes o = new MethodTypes();
		o.withParameters(10, 20);
		int value= o.withoutParametersWithReturnType();
		System.out.println(value);
		int answer=o.withParametersWithReturnType(20,50);
		System.out.println(answer);
		
	}

}
