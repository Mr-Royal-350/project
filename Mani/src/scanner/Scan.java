package scanner;
import java.util.Scanner;
public class Scan {
public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner refname= new Scanner(System.in);
String empname= refname.nextLine();
System.out.println("Emp Name:"+empname);
int empid=refname.nextInt();
System.out.println("Emp id:"+empid);
float balance=refname.nextFloat();
System.out.println("balance is:"+balance);
double point=refname.nextDouble();
System.out.println("your point is:"+point);
short pin=refname.nextShort();
System.out.println("pin is:"+pin);
boolean choice=refname.nextBoolean();
System.out.println("your choice is:"+choice);
}
}
