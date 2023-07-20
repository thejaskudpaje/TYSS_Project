package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map.Entry;

public class PrintOccuranceOfCharecterInString {
public static void main(String[] args) {
	String s="kannada";
//	//method01
//	 HashMap< Character,Integer> hm=new HashMap<>();
//	 
//	 for(int i=0;i<s.length();i++) {
//		 char ch=s.charAt(i);
//		 if(hm.containsKey(ch)) {
//			 int value= hm.get(ch);
//			 value ++;
//			 hm.put(ch, value);
//		 }
//		 else {
//			 hm.put(ch, 1);
//		 }
//	 }
//	 System.out.println(hm);
	
	//method 02
	
//	LinkedHashSet< Character> lhs=new LinkedHashSet<>();
//	for(int i=0; i<s.length();i++) {
//		lhs.add(s.charAt(i));
//	}
//	
//	for(Character ch:lhs) {
//		int count=0;
//		for(int i=0;i<s.length();i++) {
//			if(ch==s.charAt(i)) {
//				count++;
//			}
//		}
//		System.out.println(ch+" Is repeating "+count);
//	}

	
//	//method 03
	String st=s.toLowerCase();
	LinkedHashMap<Character, Object>lhm=new LinkedHashMap<>();
	for(int i=0;i<st.length();i++) {
	lhm.put(s.charAt(i), i);
	}
	
	for(Entry<Character, Object> m:lhm.entrySet()) {
		int count=0;
		for(int i=0;i<s.length();i++) {
			if(m.getKey()==s.charAt(i)) {
				count++;
			}
		}
		System.out.println(m.getKey()+" is repeating "+count);
	}
	
	
	 
}
}
