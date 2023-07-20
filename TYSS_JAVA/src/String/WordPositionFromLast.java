package String;

import java.util.LinkedHashSet;

public class WordPositionFromLast {
public static void main(String[] args) {
	String s="Im Im a a Student";
	String sa[]=s.split(" ");
	
	LinkedHashSet<String>lhs=new LinkedHashSet<>();
	for(int i=0;i<sa.length;i++) {
		lhs.add(sa[i]);
	}
	System.out.println(lhs);
	

	for(String c:lhs) {
		for(int i=sa.length-1;i>=0;i--) {
			if(c.equals(sa[i])) {
				System.out.println(sa[i]+" is in "+(i+1)+" position");//Counting the last occurance
				break;
			}
		}
	}
}
}
