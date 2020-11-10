package polymorphism;

public class MethodOverloading {
	public void MethodOverloading(String name) {
		// TODO Auto-generated method stub
System.out.println("student name:"+name);
	}
public void MethodOverloading(int rollNo, String dept, String clg) {
	// TODO Auto-generated method stub
System.out.println("roll no:"+rollNo+"\n"+dept+"\n"+clg);
}
public void MethodOverloading(long phnNo) {
	// TODO Auto-generated constructor stub
	System.out.println("phoneNo:"+phnNo);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
MethodOverloading method=new MethodOverloading();
method.MethodOverloading("Gowtham.K");
method.MethodOverloading(20, "dept:EEE", "clg:AAMEC");
method.MethodOverloading(994673774);
	}

}
