package practice;

public class PracticeOperators {
	int a=25, b=50;
	
	public void arithematicOperator()
	{
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
	}
	public void relationalOperator()
	{
		System.out.println(a==b);
		System.out.println(a!=b);
		System.out.println(a<=b);
		System.out.println(a>=b);
		
	}
	public void logicalOperator()
	{
		System.out.println(a==b && a!=b);
		System.out.println(a<=b  || a>=b);
		System.out.println(!(a==b));
	}
	public void conditionalOperator ()
	{
		System.out.println((a<b)? "A IS LESSER THAN B": "A IS GREATER THAN B" );
		
	}
	public void shorthandOperator()
	{
		a+=b;
		System.out.println(a);
		a-=b;
		System.out.println(a);
		a*=b;
		System.out.println(a);
		a/=b;
		System.out.println(a);
	}
	public void increamentdecreamentOperator()
	{
		System.out.println(++a);
		System.out.println(a++);
		System.out.println(--a);
		System.out.println(a--);
	}
	public void assignmentOperator()
	{
	System.out.println(a=b);
	}
	public void concatenationOperator()
	{
		System.out.println("JAVA" + "OPERATORS");
	}
	
	public static void main(String args[])
	{
		PracticeOperators o = new PracticeOperators();
		o.arithematicOperator();
		o.relationalOperator();
		o.logicalOperator();
		o.conditionalOperator();
		o.shorthandOperator();
		o.increamentdecreamentOperator();
		o.assignmentOperator();
		o.concatenationOperator();
	}

}
