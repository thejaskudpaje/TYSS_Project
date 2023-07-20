package String;

public class SwapFirstAndLastWordsInAString {
public static void main(String[] args) {
	String s="Im a sdet engineer";
	String sa[]=s.split(" ");
	
	//method 01
//	String rev="";
//	
//	String fs=sa[0];
//	String ls=sa[sa.length-1];
//	
//	String temp=fs;
//	sa[0]=ls;
//	sa[sa.length-1]=temp;
//	
//	for(int i=0;i<sa.length;i++) {
//		rev=rev+" "+sa[i];
//	}
//	System.out.println(rev);
//	
	
	//method 02
	String temp1=sa[0];
	sa[0]=sa[sa.length-1];
	
	sa[sa.length-1]=temp1;
	for(int i=0;i<sa.length;i++) {
		System.out.print(sa[i]+" ");
	}
}
}
