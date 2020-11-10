package citi.ctrlStatements;

import java.util.Scanner;

public class CitiConditions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner input=new Scanner(System.in);
System.out.println("*************************************************");
System.out.println("\tEligiliblity for vote");
System.out.println("*************************************************");
System.out.println("Enter your name:");
String name=input.nextLine();
System.out.println("Enter your age:");
int age=input.nextInt();
if (age>=18) {
	System.out.println("You are eligible to vote");
}
else {
	System.out.println("You are not eligible to vote");
}
	}

}
