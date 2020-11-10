package citiStrings;

public class LitNonLit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s1="mani";
String s2="kandan";
System.out.println("Literal String");
System.out.println("Address of s1:"+System.identityHashCode(s1));
System.out.println("Address of s2:"+System.identityHashCode(s2));
System.out.println("**************************************");
String s3=s1.concat(s2);
System.out.println(" String after concat:"+s3);
System.out.println("***************************************");
System.out.println("Non Literal String:");
StringBuffer s4=new StringBuffer("mani");
StringBuffer s5=new StringBuffer("manii");
System.out.println("Address of s4:"+System.identityHashCode(s4));
System.out.println("address of s5:"+System.identityHashCode(s5));

	}

}
