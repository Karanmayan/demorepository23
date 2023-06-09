package exception;

import java.util.Scanner;

public class ExceptionHandling {
	
	public static void main(String[] args) {
		
		System.out.println("ENTER THE TWO NUMBERS");
		Scanner o = new Scanner(System.in);
		try 
		{
		int num1 = o.nextInt();
		int num2 = o.nextInt();
		System.out.println(num1/num2);
		}
		catch(Exception e)
		{
			System.err.println("UNKNOWN ERROR");
		}
		finally
		{
			System.out.println("FINALLY EXECUTED");
		}
		System.out.println("PROGRAM COMPLETED");
		
	}

}
