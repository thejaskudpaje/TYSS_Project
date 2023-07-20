package String;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class RemoveDuplicatesusingMap {
public static void main(String[] args) {
	String s="kannada";
	 LinkedHashMap< Character,Integer> hm=new LinkedHashMap<>();	 
	 for(int i=0;i<s.length();i++) {
		 char ch=s.charAt(i);
		 if(!(hm.containsKey(ch))) {		
			 hm.put(ch, i);
		 }		
	 }
	 
	/*printing using for loop*/
	 for(Character c:hm.keySet()) {
		 System.out.print(c.charValue());
		
	 }
	 System.out.println();
	 
	/*printing using iterator*/
Set st=hm.keySet();
Iterator it = st.iterator();
while(it.hasNext()) {
	System.out.print(it.next());
}
	 
}	

}
