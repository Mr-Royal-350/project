package citi.ctrlStatements;

public class CitiSplit {
public static void main(String[] args) {
	String m="manikandan";
	String[] split = m.split("a");
	for (String x : split) {
		System.out.println(x);
	}
}
}
