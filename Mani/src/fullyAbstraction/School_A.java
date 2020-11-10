package fullyAbstraction;

public class School_A implements ClassA,ClassB {
@Override
public void SchoolName() {
	// TODO Auto-generated method stub
System.out.println("school Name:National School");	
}
@Override
	public void TotalStudents() {
		// TODO Auto-generated method stub
	System.out.println("total students are:2000");	
	}
@Override
	public void SchoolAddress() {
		// TODO Auto-generated method stub
	System.out.println("School located at:Thiruvarur");	
	}
public static void main(String[] args) {
	School_A shl=new School_A();
	shl.SchoolName();
	shl.TotalStudents();
	shl.SchoolAddress();
}
}
