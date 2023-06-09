package collections;

import java.util.*;

public class HashSetPractice {
	
	public static void main(String[] args) {
		HashSet<Object> a = new HashSet<>();
		
		a.add("JAVA");
		a.add("PROGRAM");
		a.add(100);
		a.add(true);
		a.add(null);
		a.add('z');
		a.add("JAVA");
		
		System.out.println(a);
		
		boolean contains = a.contains('z');
		System.out.println(contains);
		
		int size = a.size();
		System.out.println(size);
		a.remove(true);
		System.out.println(a);
		
		System.out.println("CONVERT INTO ARRAY");
		
		Object[] arr = a.toArray();
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		System.out.println("ITERATING A SINGLE VALUE");
		for(int j=0;j<arr.length;j++)
		{
			if (j==2)
			{
				System.out.println(arr[j]);
			}
		}
		System.out.println("USING ENHANCED FOR LOP");
		for(Object k:a)
		{
			System.out.println(k);
		}
		System.out.println("USING ITERATOR METHOD");
		
		Iterator<Object> i = a.iterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		System.out.println("USING LAMBDA EXPRESSION");
		a.forEach(k->System.out.println(k));
	}

}
