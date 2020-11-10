package citiCollectionMap;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Citi_Map {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Map<String,String > m=new Hashtable();
m.put("mani","selenium");
m.put("vannan","frameWork");
m.put("boss","oracel");
m.put("Vengat","orejava");
m.put("subash","jira");

Set<Entry<String,String>> a=m.entrySet();
for (Entry<String, String> x : a) {
	System.out.println(x.getKey());
	System.out.println(x.getValue());
	System.out.println("\n");
}
}
	}


