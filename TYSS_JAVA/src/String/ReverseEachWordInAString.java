package String;

public class ReverseEachWordInAString {
public static void main(String[] args) {
	String s="Im a sdet engineer";
	String sa[]=s.split(" ");
	
	//method 01
//	String rev="";
//	for(int i=0;i<sa.length;i++) {
//		String st=sa[i];
//		char ch[]=st.toCharArray();
//		int m=0;
//		int n=ch.length-1;
//		while(m<n) {
//			char temp=ch[m];
//			ch[m]=ch[n];
//			ch[n]=temp;	
//			m++;
//			n--;
//		}
//		String st1=new String(ch);
//		rev=rev+" "+st1;
//	}
//	System.out.println(rev);
	
	//method 02
	for(int i=0;i<sa.length;i++) {
		String r=sa[i];
		for(int j=r.length()-1;j>=0;j--) {
			System.out.print(r.charAt(j));
		}
		System.out.print(" ");
	}
}
}
