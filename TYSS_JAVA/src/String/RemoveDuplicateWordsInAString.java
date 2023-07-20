package String;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

public class RemoveDuplicateWordsInAString {
public static void main(String[] args) {
	String s="Im Im a a Student";
	String sa[]=s.split(" ");
	
	//using collection
//	LinkedHashSet<String> lhs=new LinkedHashSet<>();
//	for(int i=0;i<sa.length;i++) {
//		lhs.add(sa[i]);
//	}
//	System.out.println(lhs);
//	Iterator<String> it = lhs.iterator();
//	while(it.hasNext()) {
//		System.out.print(it.next()+" " );
//	}
	
	//using map
	LinkedHashMap<String , Object> lhm=new LinkedHashMap<>();
	for(int i=0;i<sa.length;i++) {
		lhm.put(sa[i], i);
	}
for(String m:lhm.keySet()) {
	System.out.print(m+" ");
}
	
	
}
}
