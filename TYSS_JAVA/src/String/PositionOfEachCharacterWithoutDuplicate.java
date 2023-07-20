package String;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class PositionOfEachCharacterWithoutDuplicate {
public static void main(String[] args) {
	String s="karnataka";
	
	//method 01
	 LinkedHashMap< Character,Integer> hm=new LinkedHashMap<>();	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(!(hm.containsKey(ch))) {
			
			 hm.put(ch, i+1);
		 }		
	 }
	 System.out.println(hm);
	
	 
//method 02
//	 LinkedHashSet<Character> lhs=new LinkedHashSet<>();
//	 for(int i=0;i<s.length();i++) {
//		 lhs.add(s.charAt(i));
//	 }
//	 
//	 for(Character ch: lhs) {
//		 for(int i=0;i<s.length();i++) {
//			 if(ch==s.charAt(i)) {
//				 System.out.println(s.charAt(i)+" is in "+(i+1)+"position");
//				 break;
//			 }
//		 }
//	 }
}
}
