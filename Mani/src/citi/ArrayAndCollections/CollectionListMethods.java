package citi.ArrayAndCollections;

import java.util.ArrayList;
import java.util.List;

public class CollectionListMethods {
	public static void main(String[] args) {
		List<String> li=new ArrayList();
		//1.addition in list
		li.add("35");
		li.add("sriram");
		li.add("55.66");
		li.add("karthikeyan");
		System.out.println("output  in list :"+li);
		//2.To find size of list
		int i = li.size();
		System.out.println("the size of the list is:"+i);
		//3.Replace the values in list
		li.set(2, "kandan");
		System.out.println("Output after replacing:"+li);
		//4.Adding new value to list
		li.add(4, "5588.9955");
		System.out.println("the updated list :"+li);
		//5.remove the value from list
		li.remove(2);
		System.out.println("list after remove :"+li);
		//6.to find index of value in list 
		int j = li.indexOf("vishal");
		System.out.println("the index of 'karthikeyan' is:"+j);
		//7.to find last index of value in list
		int lastIndexOf = li.lastIndexOf("mani");
		System.out.println("the last index of sriram is:\s"+lastIndexOf);
		//8.Add all value to another list
		List<String>l1=new ArrayList();
		boolean addAll = l1.addAll(li);
		System.out.println("is the value added :"+addAll);
		System.out.println("the new list l1 is:"+l1);
		//9.remove all value from the string
		l1.removeAll(li);
		System.out.println("the values in the list l1:\s"+l1);
		//10.retain the value from removed list
		l1.retainAll(li);
		System.out.println("the retained values are:\s"+li);
		
	}

}
