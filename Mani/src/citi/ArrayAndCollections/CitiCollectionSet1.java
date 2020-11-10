package citi.ArrayAndCollections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class CitiCollectionSet1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1.1 HashSet
Set<Integer> a=new HashSet();
a.add(5);
a.add(4);
a.add(3);
a.add(2);
a.add(1);
System.out.println("By using hashset array is:\s"+a);
//1.2 LinkedHashSet
Set<Integer> b=new LinkedHashSet();
b.add(1);
b.add(5);
b.add(2);
b.add(3);
b.add(4);
System.out.println("by using the linked hash set arry is:"+b);
//1.3 TreeSet
Set<Integer> c=new TreeSet();
c.add(1);
c.add(5);
c.add(2);
c.add(3);
c.add(4);
System.out.println("bu using Tree set arrray is :");
	}

}
