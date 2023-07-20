package String;

import java.util.LinkedHashMap;

public class PositionOfEachWord {
public static void main(String[] args) {
	String s="Im Im a a Student";
	String sa[]=s.split(" ");
	
	
	 LinkedHashMap< String,Integer> hm=new LinkedHashMap<>();	 
	 for(int i=0;i<sa.length;i++) {
		 String st=sa[i];
		 if(!(hm.containsKey(st))) {
			
			 hm.put(st, i+1);
		 }		
	 }
	 System.out.println(hm);
}
}
