package practice;

public class SteingPractice {
	
	public static void main(String[] args) {
		String s = "PROGRAMMING";
		String s1 = "program";
		String s2 = "   JAVA PROGRAM   ";
		String s3 = "WELCOME JAVA PROGRAMMING";
		System.out.println(s.toLowerCase());
		System.out.println(s1.toUpperCase());
		System.out.println(s2);
		System.out.println(s2.trim());
		System.out.println(s.indexOf('r'));
		System.out.println(s.charAt(3));
		System.out.println(s3.startsWith("WEL"));
		System.out.println(s3.endsWith("ING"));
		System.out.println(s2.contains("RAM"));
		System.out.println(s.concat(s2));
		System.out.println(s3.substring(7));
		System.out.println(s3.substring(4,7));
		
		
		char[] c = s.toCharArray();
		for(char character: c)
		{
			System.out.println(character);
		}
		System.out.println();
		System.out.println("USING SPLIT FUNCTION");
		
		String[] split = s3.split(" ");
		for(String sp: split)
		{
			System.out.println(sp);
		}
		
	}

}
