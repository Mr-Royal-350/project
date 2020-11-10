package userDefn_SetMap;

import java.util.ArrayList;
import java.util.List;

public class UserDefn_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserDefnList udl1=new UserDefnList();
		UserDefnList udl2=new UserDefnList();
		UserDefnList udl3=new UserDefnList();
		udl1.setName("Manikandan");
		udl1.setId("hcl-555");
		udl1.setJob("manager");
		udl2.setName("steave");
		udl2.setId("hcl-222");
		udl2.setJob("staf");
		udl3.setName("Ramu");
		udl3.setId("hcl-888");
		udl3.setJob("acountant");
		List<UserDefnList> x=new ArrayList<UserDefnList>();
		x.add(udl1);
		x.add(udl2);
		x.add(udl3);
		for(UserDefnList y: x) {
			System.out.println(y.getName());
			System.out.println(y.getId());
			System.out.println(y.getJob());
			System.out.println("\n");
		}
	}

}
