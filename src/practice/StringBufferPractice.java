package practice;

public class StringBufferPractice {
	
	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("JAVA");
		System.out.println(sb.hashCode());
		sb.append("Program");
		System.out.println(sb);
		System.out.println(sb.hashCode());
		sb.insert(0, "A ");
		System.out.println(sb);
		sb.replace(0, 5, "AnJAVA");
		System.out.println(sb);
		sb.reverse();
		System.out.println(sb);
		System.out.println(sb.hashCode());
				
	}

}
