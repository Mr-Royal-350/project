package singleInheritance;

public class EmployeeParent extends CompanyChild {
	public void employeeName() {
		System.out.println("Employee name:Swaminathan");
			// TODO Auto-generated method stub
	}
	public void employeeId() {
		System.out.println("employee id:311");
			// TODO Auto-generated method stub
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
EmployeeParent emp=new EmployeeParent();
emp.employeeName();
emp.employeeId();
emp.companyName();
emp.companyAddress();
	}

}
