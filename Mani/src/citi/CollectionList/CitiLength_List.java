package citi.CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiLength_List {
	public static void main(String[] args) {
		System.out.println("********************************************");
		System.out.println("\s\sJava prgm to find the length of list");
		System.out.println("\n*********************************************");
		List<Integer> a=new ArrayList();
		a.add(10);
		a.add(20);
		a.add(30);
		a.add(90);
		a.add(10);
		a.add(10);
		a.add(40);
		a.add(50);
		Scanner input=new Scanner(System.in);
		System.out.println("Enter the add number location:");
		int local = input.nextInt();
		System.out.println("Enter the Add number :");
		int str = input.nextInt();
		a.add(local,str);
		System.out.println("Stored list is :"+a);
	}

}
