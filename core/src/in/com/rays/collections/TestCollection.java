package in.com.rays.collections;

import java.util.ArrayList;
import java.util.Collection;

public class TestCollection {
	public static void main(String[] args) {
		Collection c1 = new ArrayList();
		
		c1.add("Bharti");
		c1.add("Mahi");
		c1.add("MUskan");
		c1.add("Ajay");
		System.out.println("c1 = "+c1);
		Collection c2 = new ArrayList();
		
		c2.add("ten");
		c2.add(1);
		System.out.println("c2 = "+c2);
		c1.addAll(c2);
		
		System.out.println("c1 = "+c1);
		System.out.println("contains = "+ c1.contains("ten"));
		System.out.println("containsAll=" + c1.containsAll(c2));
		System.out.println("Empty =" + c1.isEmpty());
		//c1.remove("ten");
		//System.out.println("remove = "+ c1);
		
		//c1.removeAll(c2);
		//System.out.println("removeAll = "+c1);
		c1.retainAll(c2);
		System.out.println("c1="+c1);
		c1.size();
		System.out.println("size= "+c1.size());
		
		
		
		
		
		
		
	}

}
