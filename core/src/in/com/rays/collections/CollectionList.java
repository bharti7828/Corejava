package in.com.rays.collections;

import java.util.ArrayList;
import java.util.List;

public class CollectionList {
	public static void main(String[] args) {
		 ArrayList list = new ArrayList();
		 
		 list.add(100);
		 list.add("mahi");
		 list.add("muskan");
		 list.add(true);
		 
		 System.out.println("List = "+list);
		 
		 System.out.println(list.get(2));
		 
		 list.set(2, "kasera");
		 
		 System.out.println(list);
		 System.out.println("indexof ="+list.indexOf("kasera"));
		 System.out.println("last indexof ="+list.lastIndexOf("mahi"));
		 System.out.println("list ="+list.subList(0, 4));
		 
	}

}
