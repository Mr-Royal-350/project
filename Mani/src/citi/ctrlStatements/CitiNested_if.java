package citi.ctrlStatements;
import java.util.Scanner;
public class CitiNested_if {
public static void main(String[] args) {
// TODO Auto-generated method stub
Scanner nest=new Scanner(System.in);
System.out.println("***********************************");
System.out.println("\s\sFinding the Smallest number");
System.out.println("***********************************");
System.out.println("Enter a value:");
int a=nest.nextInt();
System.out.println("Enter b value:");
int b=nest.nextInt();
System.out.println("Enter c value:");
int c=nest.nextInt();
if (a<b && a<c) {
	System.out.println(a+"\s:is smaller");
}
else if (b<a && b<c) {
	System.out.println(b+"\s:is smaller");
}
else {
	System.out.println(c+"\s:is smaller");
}
	}

}
