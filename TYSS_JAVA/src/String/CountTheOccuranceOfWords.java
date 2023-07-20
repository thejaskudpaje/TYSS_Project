package String;

import java.util.HashMap;

public class CountTheOccuranceOfWords {
public static void main(String[] args) {
	String s="Im Im a a Student";
	String sa[]=s.split(" ");
//	String sa[]=s.split("\\s+"); to ignore spaces
	HashMap<String, Integer> hm=new HashMap<>();
	for(int i=0; i<sa.length;i++) {
		String st=sa[i];
		if(hm.containsKey(st)) {
			int value=hm.get(st);
			value ++;
			hm.put(st, value);
		}
		else
			hm.put(st, 1);
	}
	System.out.println(hm.entrySet());
}
}
