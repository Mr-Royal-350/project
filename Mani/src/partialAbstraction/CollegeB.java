package partialAbstraction;

public  class CollegeB extends CollegeA {
	@Override
	public void collegeName() {
		// TODO Auto-generated method stub
System.out.println("college name is:AAMEC");		
	} 
@Override
public void availableDepartments() {
	// TODO Auto-generated method stub
	System.out.println("Available depts:EEE,CIVIL,MECH,ECE");
}
public static void main(String[] args) {
	CollegeB clg=new CollegeB();
	clg.collegeName();
	clg.availableDepartments();
	clg.totaStudentsl();
	
}
}
