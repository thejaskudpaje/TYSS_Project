package String;

public class ReverseAString {
public static void main(String[] args) {
	//mehod 01
//	String s="software";
//	char ch[]=s.toCharArray();
//	int i=0;
//	int j=s.length()-1;
//while(i<j) {
//	char temp=ch[i];
//	ch[i]=ch[j];
//	ch[j]=temp;
//	i++;
//	j--;
//}
//String rev=new String(ch);
//System.out.println(rev);
	
	
	//Metod02
//	String s="software";
//	for(int i=s.length()-1;i>=0;i--) {
//		System.out.print(s.charAt(i));
//	}
	
	
	//method 03
//	String s="software";
//char ch[]=s.toCharArray();
//for(int i=ch.length-1;i>=0;i--) {
//	System.out.print(ch[i]);
//}
	
	//method04
//	String s="software";
//	char ch[]=s.toCharArray();
//	int count=0;
//	for(char i:ch) {
//		count++;
//	}
//	for(int i=count-1;i>=0;i--) {
//		System.out.print(ch[i]);
//	}
	
//method05
//	String s="software";
//	String rev="";
//	for(int i=s.length()-1;i>=0;i--) {
//		rev=rev+""+s.charAt(i);
//	}
//	System.out.println(rev);
	
	
	//method 06
	String s="software";
	StringBuilder sb=new StringBuilder(s);
	System.out.println(sb.reverse());
}
}
