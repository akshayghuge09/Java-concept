package collections;

import java.util.HashSet;
import java.util.Set;

public class Set_Collection {

	public static void main(String[] args) {
		Set s =new HashSet();
		s.add(12);
		s.add("hello");
		s.add(12.12f);
		s.add(12.565);
		s.add(null);
		System.out.println(s.isEmpty());
		System.out.println(s.size());
		System.out.println(s.contains(12));
		System.out.println(s.remove(null));
		for(Object o : s)
		{
			System.out.println(o);
		}
		s.removeAll(s);
		System.out.println(s.isEmpty());
	}

}
