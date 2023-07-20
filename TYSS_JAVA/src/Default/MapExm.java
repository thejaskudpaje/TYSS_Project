package Default;

import java.util.HashMap;

public class MapExm {
public static void main(String[] args) {
	HashMap<String, Object> hm=new HashMap<>();
	hm.put(null, null);
	hm.put("Name", "thejas");
	hm.put("Age	", 26);
	
	System.out.println(hm);
}
}
