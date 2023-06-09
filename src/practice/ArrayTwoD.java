package practice;

public class ArrayTwoD {
	char arr[][]={{'a','b','c'},{'d','e','f','g','h'},{'i','j','k','l','m'},
			      {'n','o','p','q','r','s','t'}  };
	
	public void arrayTwoD()
	{
		System.out.println(arr.length);
		System.out.println(arr[1].length);
		for(int row=0;row<arr.length;row++)
		{
			for(int col=0;col<arr[row].length;col++)
			{
				System.out.print(arr[row][col] + " ");
			}
			System.out.println();
		}
		System.out.println(" USING ENHANCED FOR LOOP");
		for(char[]k:arr)
		{
			for(char j:k)
			{
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		ArrayTwoD o = new ArrayTwoD();
		o.arrayTwoD();
		
	}
	

}
