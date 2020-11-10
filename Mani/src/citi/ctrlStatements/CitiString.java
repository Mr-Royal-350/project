package citi.ctrlStatements;

public class CitiString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// methods
		String m="Manikandan B";
			//1.finding the length of the string
				int length = m.length();
		System.out.println("the length of the string is:"+length);
		//2.picking only one letter from the string
		char charAt = m.charAt(4);
		System.out.println("the character at the position 4 is:"+charAt);
		//3.convert string to uppercase
		String upperCase = m.toUpperCase();
		System.out.println("the uppercase of the string is:"+upperCase);
		//4.convert string to lowercase
		String l="MANIKANDAN.B";
		String lowerCase = l.toLowerCase();
		System.out.println("the lowercase of the string is:"+lowerCase);
		//5.start with
		boolean startsWith = m.startsWith("Man");
		System.out.println("if the string is start with 'Man':"+startsWith);
		//6.ends with
		boolean endsWith = m.endsWith("dan");
		System.out.println("if the string ends with 'dan' :"+endsWith);
		//7.adding
		String m1="_1999";
		String concat = m.concat(m1);
		System.out.println("the string after adding is:"+concat);
		//8.index of char
		int indexOf = m.indexOf("n");
		System.out.println("the indexof string 'n' is:"+indexOf);
		//9.the last index
		int lastIndexOf = m.lastIndexOf("B");
		System.out.println("the last index of the string is:"+lastIndexOf);
		//10.replace char in string
		String replace = m.replace('a', '5');
		System.out.println("the string after repalcing the char:"+replace);
		//11.compare 2 strings
		String n1="mani";
		String n2="manii";
		boolean equals = n1.contentEquals(n2);
		System.out.println("the result after comparing 2 strings:\s"+equals);
		//12.compare 2 strings ignore case
		boolean equals1 = n1.equalsIgnoreCase(n2);
		System.out.println("string after ignoring:\s"+equals1);
		
	}

}
