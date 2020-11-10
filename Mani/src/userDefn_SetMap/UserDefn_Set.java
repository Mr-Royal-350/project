package userDefn_SetMap;

import java.util.LinkedHashSet;
import java.util.Set;

public class UserDefn_Set {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Employee Details using Userdefined Set");
		System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
UserDefnSet uds1=new UserDefnSet();
UserDefnSet uds2=new UserDefnSet();
UserDefnSet uds3=new UserDefnSet();
uds1.setName("Mani");
uds1.setId(35);
uds1.setSalary(23000);
uds2.setName("Ram");
uds2.setId(22);
uds2.setSalary(15000);
uds3.setName("Vishal");
uds3.setId(95);
uds3.setSalary(10000);
Set<UserDefnSet> x=new LinkedHashSet<UserDefnSet>();
x.add(uds1);
x.add(uds2);
x.add(uds3);
for(UserDefnSet y :x) {
	System.out.println(y.getName());
	System.out.println(y.getId());
	System.out.println(y.getSalary());
	System.out.println("\n");
}
	}

}
