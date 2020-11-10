package citi.ctrlStatements;

import java.util.Scanner;

public class CitiString_rev {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);
System.out.println("Enter the string to be reversed:");
String input=s1.next();
String rev="";
for (int i = input.length()-1; i >=0; i--) {
	char c=input.charAt(i);
	rev=rev+c;
	
}
System.out.println("the string after reversing:\s"+rev);
	}

}
