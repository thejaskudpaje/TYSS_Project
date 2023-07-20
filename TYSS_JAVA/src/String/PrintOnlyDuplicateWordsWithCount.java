package String;

import java.util.LinkedHashSet;

public class PrintOnlyDuplicateWordsWithCount {
public static void main(String[] args) {
	String s="Im Im a a Student";
	String sa[]=s.split(" ");
	
	LinkedHashSet< String> lhs=new LinkedHashSet<>();
	for(int i=0; i<sa.length;i++) {
		lhs.add(sa[i]);
	}
	
	for(String st:lhs) {
		int count=0;
		for(int i=0;i<sa.length;i++) {
			if(st.equals(sa[i])) {
				count++;
			}
		}
		if(count>1)
		System.out.println(st+" Is repeating "+count);
	}
}
}
