package staticKeyword;

public class StaticPractice {
	String a;
	String b;
	static String c= "CAR";
	
	public void display(String d ,String e,String f)
	{
		d=a;
		e=b;
		f=c;
		System.out.println(d+e+c);
	}
public static void main(String[] args) {
	StaticPractice o = new StaticPractice();
	o.display("a", "a", "a");
	
}
}
