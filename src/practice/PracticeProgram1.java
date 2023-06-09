package practice;

public class PracticeProgram1
{
	int a=10;                    //variable declaration
	int b=25;
	
	public void operators()     //instance method
	{
		System.out.println("A=10");
		System.out.println("B=25");
		System.out.println("A+B=");
		System.out.println(a+b);
		System.out.println("A-B=");
		System.out.println(a-b);
		System.out.println("A*B=");
		System.out.println(a*b);
		System.out.println("A/B=");
		System.out.println(a/b);
		System.out.println("A%B=");
		System.out.println(a%b);
		System.out.println("IS A=B");
		System.out.println(a==b);
		System.out.println("IS A NOT EQOAL TO B");
		System.out.println(a!=b);
		System.out.println("IS A IS LESSER THAN EQUAL OR TO B");
		System.out.println(a<=b);
		System.out.println("IS A GREATER THAN OR EQUAL TO B");
		System.out.println(a>=b);
   }
	public static void main (String args[])   //main method
	{
		PracticeProgram1 output = new PracticeProgram1();  //instance object
		output.operators();         //method call using object
		}
}
