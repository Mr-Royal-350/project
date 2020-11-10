package citi.CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiList_4_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("********************************************************************");
System.out.println("Creating a new LinkedListlist with values and find the length of it");
System.out.println("********************************************************************");
List<Integer> b=new ArrayList();
b.add(100);
b.add(200);
b.add(300);
b.add(400);
b.add(500);
b.add(600);
b.add(700);
System.out.println("the old list is:"+b);
Scanner input=new Scanner(System.in);
System.out.println("Enter the size of the list:");
int n = input.nextInt();
System.out.println("Enter the value one by one:");
for(int i=0; i<n; i++) {
	int added = input.nextInt();
	b.add(added);
}
	
System.out.println("The new list is "+b);
System.out.println("the size of the new list is :"+b.size());
}

}
