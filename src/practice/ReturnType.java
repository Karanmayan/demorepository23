package practice;

public class ReturnType {
	public int [] method()
	{
		int arr[]= {50,100,150,200};
		return arr;
	}
public int [] add(int array[])
{
	return array;
}
public static void main(String[] args) {
	ReturnType o = new ReturnType();
	System.out.println("WITHOUT PARAMETERS WITH RETURN TYPE");
	int[] method = o.method();
	for(int a=0;a<method.length;a++)
	{
	System.out.print(method[a]+" ");
}
	System.out.println();
	System.out.println("WITH PARAMETERS WITH RETURN TYPE");
	int a[]= {10,20,30,40};
	int[] add = o.add(a);
	for(int b=0;b<add.length;b++)
	{
		System.out.print(add[b] + " ");
	}
}
}