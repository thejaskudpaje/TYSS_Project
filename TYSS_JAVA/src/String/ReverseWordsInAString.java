package String;

public class ReverseWordsInAString {
public static void main(String[] args) {
	String s="Im a sdet engineer";
	String sa[]=s.split(" ");
	
	for(int i=sa.length-1;i>=0;i--) {
		System.out.print(sa[i]+" ");
	}
}
}
