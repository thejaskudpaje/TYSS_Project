package String;

public class PrintPositionOfEachCharecter {
public static void main(String[] args) {
	String s="karnataka";
	for(int i=0;i<s.length();i++) {
		System.out.println(s.charAt(i)+"-->"+(i+1));
	}
}
}
