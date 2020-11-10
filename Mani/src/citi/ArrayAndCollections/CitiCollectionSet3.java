package citi.ArrayAndCollections;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CitiCollectionSet3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int b=0;
Scanner s=new Scanner(System.in);
//3.2 HashSet
Set<Integer> se=new HashSet();
System.out.println("Enter the length of the list:");
b= s.nextInt();
System.out.println("Enter the elements of the list:");
int a[]=new int[b];
for(int i=0; i<b; i++) {
	a [i]=s.nextInt();
	se.add(a[i]);
	
}
System.out.println("The element in the list by using HashSet"+se);
// TreeSet
Set<Integer> se1=new TreeSet();
se1.addAll(se);
System.out.println("The element in the list by using TreeSet"+se1);

	}

}
