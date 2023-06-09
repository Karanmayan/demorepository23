package collections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListPractice {

	public static void main(String[] args) {
		ArrayList<Object> a = new ArrayList<>();
		
		a.add("JAVA");
		a.add("PROGRAM");
		a.add(10);
		a.add('a');
		a.add(true);
		a.add("C0LLECTION");
		a.add("JAVA");
		
		System.out.println(a);
		
		int k = a.indexOf(10);
		System.out.println(k);
		
		int l = a.lastIndexOf("JAVA");
		System.out.println(l);
		
		Object o = a.get(3);
		System.out.println(o);
		
		int size = a.size();
		System.out.println(size);
		
		a.set(5, "ARRAY LIST");
		System.out.println(a);
		
		a.remove(5);
		System.out.println(a);
		
		a.remove(true);
		System.out.println(a);
		
		ArrayList<Object> b = new ArrayList<>();
		b.addAll(a);
		System.out.println(b);
		
		b.clear();
		
		System.out.println(b);
		
		System.out.println("USING NORMAL LOOP");
		
		for(int i =0;i<a.size();i++)
		{
			System.out.println(a.get(i));
		}
		
		System.out.println("USING ENHANCED FOR LOOP");
		
		for(Object p:a)
		{
			System.out.println(p);
		}
		
		System.out.println("USING ITERATOR METHOD");
		
		Iterator<Object>r=a.iterator();
		
		while(r.hasNext())
		{
			System.out.println(r.next());
		}
		
		System.out.println("USING LAMBDA EXPRESSION");
		
		a.forEach(f->System.out.println(f));
	}
}
