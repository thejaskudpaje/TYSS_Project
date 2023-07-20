package String;

import java.util.HashMap;
import java.util.LinkedHashSet;

public class PrintOnlyDuplicatesWithCount {
public static void main(String[] args) {
	String s="kannada";
	
	//method 01
	 HashMap< Character,Integer> hm=new HashMap<>();	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(hm.containsKey(ch)) {
			 int value= hm.get(ch);
			 value ++;
			 hm.put(ch, value);
		 }
		 else {
			 hm.put(ch, 1);
		 }
	 }
	 //continue	
	
	
	//method 02
	LinkedHashSet< Character> lhs=new LinkedHashSet<>();
	for(int i=0; i<s.length();i++) {
		lhs.add(s.charAt(i));
	}
	
	for(Character ch:lhs) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(ch==s.charAt(i)) {
				count++;
			}
		}
		if(count>1)
		System.out.println(ch+" Is repeating "+count);
	}
	
	
}
}
