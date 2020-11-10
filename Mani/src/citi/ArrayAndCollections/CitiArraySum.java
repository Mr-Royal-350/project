package citi.ArrayAndCollections;

import java.util.Scanner;

public class CitiArraySum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************************************");
		System.out.println("Java prgm to sum & Avg the values in an array");
		System.out.println("********************************************");
Scanner obj=new Scanner(System.in);
int [] array=new int[10];
int sum=0;
float avg=0;
System.out.println("Enter the element:");
for (int i=0; i<10; i++)
{
	array[i] = obj.nextInt();
}
for (int num : array) {
	sum= sum+num;
}
avg =sum/10;
System.out.println("sum of the elements in array is:"+sum);
System.out.println("Avg of array element is :"+avg);
}	

}
