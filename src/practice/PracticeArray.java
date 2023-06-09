package practice;

public class PracticeArray {
	String arr[]= { "APPLE", "MANGO","ORANGE","BANANA","GRAPES","JACK FRUIT"};
	
	public void array()
	{
		System.out.println(arr.length);
		System.out.println(arr[2]);
		System.out.println(arr[4]);
		System.out.println("FOR LOOP");
		for(int i=0;i< arr.length ;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("REVERSE");
		for( int i= arr.length-1; i>=0;i--)
		{
			System.out.println(arr[i]);
		}
		System.out.println("ENHANCED FOR LOOP");
		for(String k: arr)
		{
			System.out.println(k);
		}
		
		
	}
	public static void main(String[] args)
	{
		PracticeArray o = new PracticeArray();
		o.array();
		
	}

}
