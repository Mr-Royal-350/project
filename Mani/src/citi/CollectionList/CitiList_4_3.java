package citi.CollectionList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CitiList_4_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("**************************************************");
		System.out.println("Removing value present in 2nd index ");
		System.out.println("**************************************************");
		List<Integer> a = new ArrayList();
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the size of list:");
		int n = input.nextInt();
		System.out.println("Enter the value:");
		for (int i = 0; i < n; i++) {
			int added = input.nextInt();
			a.add(added);

		}
		System.out.println("The List  is :" + a);
		System.out.println("Enter the remove value");
		int r = input.nextInt();
		for (int i = n-1; i >0; i--) {
			if (a.get(i)==r) {
				a.remove(i);
				break;
			}
			
		}
		System.out.println("list after removing the index :"+a);

	}

}
