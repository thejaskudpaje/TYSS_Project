package String;

import java.util.Scanner;

public class StringPalindrome {
public static void main(String[] args) {
	
	//method 01
//	String s="aabba";
//	char ch[]=s.toCharArray();
//	
//	int i=0;
//	int j=ch.length-1;
//	while(i<j) {
//		if(ch[i]!=ch[j]) {
//			System.out.println("Not palindrome");
//			break;
//		}
//		else if(ch[i]==ch[j]) {
//			i++;
//			j--;
//		}
//	}
//	if(i>=j){
//	System.out.println("palindrome");
//	}
	
	//method 02
	for(;;) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String s=sc.next();
		
		//String s="aabbaa";
		String rev="";
	for(int i=s.length()-1;i>=0;i--) {
		rev=rev+""+s.charAt(i);
		}
	if(rev.equals(s)) {
		System.out.println("Palindrome");
	}
	else
		System.out.println("not palindrome");
	}
	
}
}
