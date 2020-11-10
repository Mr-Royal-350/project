package userDefn_SetMap;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class UserDefn_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("********************");
		System.out.println("Employee Details\n");
		System.out.println("*******************");
UserDefnMap udm1=new UserDefnMap();
UserDefnMap udm2=new UserDefnMap();
UserDefnMap udm3=new UserDefnMap();
UserDefnMap udm4=new UserDefnMap();
udm1.setName("mani");
udm1.setSdId("sd350");
udm1.setDob("1-oct-99");
udm1.setPhone("9885688745");
udm1.seteMail("manii@gmail.com");
udm1.setGender("Male");
udm1.setSal("23000");

udm2.setName("mano");
udm2.setSdId("sd565");
udm2.setDob("02-jun-98");
udm2.setPhone("9536658745");
udm2.seteMail("manoo@gmail.com");
udm2.setGender("Male");
udm2.setSal("24000");

udm3.setName("suresh");
udm3.setSdId("sd998");
udm3.setDob("03-july-2000");
udm3.setPhone("966325477");
udm3.seteMail("suresh@gmail.com");
udm3.setGender("male");
udm3.setSal("12000");
Map<Integer,UserDefnMap > x=new LinkedHashMap<Integer,UserDefnMap>(); 
x.put(1,udm1);
x.put(2,udm2);
x.put(3,udm3);
Set<Entry<Integer,UserDefnMap>> y=x.entrySet();
for(Entry<Integer, UserDefnMap> entry : y) {
	System.out.println("Employee name is:"+entry.getValue().getName());
	System.out.println("ID is :"+entry.getValue().getSdId());
	System.out.println("DOB is :"+entry.getValue().getDob());
	System.out.println("Gender :"+entry.getValue().getGender());
	System.out.println("phone no:"+entry.getValue().getPhone());
	System.out.println("eMail :"+entry.getValue().geteMail());
	System.out.println("sallary:"+entry.getValue().getSal());
	System.out.println("\n");
}

}

}
