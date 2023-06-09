package collections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HahMapPractice {

	public static void main(String[] args) {
		
		HashMap<String,Integer> h = new HashMap<>();
		h.put("TAMIL",95);
		h.put("ENGLISH", 90);
		h.put("MATHS", 90);
		h.put(null, 75);
		h.put("SOCIAL", 84);
		h.put("SCIENCE", 81);
		
		System.out.println(h);
		
		System.out.println("ITERATING ONLY THE KEYS");
		
		Set<String> k = h.keySet();
		for(String a:k)
		{
			System.out.println(a);
		}
		
		System.out.println("ITERATING INLY THE VALUES");
		
		Collection<Integer> values = h.values();
		for(Integer v:values)
		{
			System.out.println(v);
			
		}
		Set<Entry<String, Integer>> entrySet = h.entrySet();
		
		for(Entry<String,Integer> i : entrySet)
		{
			System.out.println(i.getKey() + "==" + i.getValue());
		}
		System.out.println("GETTING ONLY THE VALUE");
		Set<Entry<String, Integer>> entrySet2 = h.entrySet();
		for(Entry<String, Integer> j :entrySet)
		{
			if(j.getKey()=="SCIENCE")
			{
				System.out.println(j.getValue());
			}
			
		
		}
		System.out.println("ITERATING VALUE USING GET KEY");
		System.out.println(h.get("TAMIL"));
		}
		
	}

