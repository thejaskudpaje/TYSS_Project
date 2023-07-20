package Default;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set01 {
public static void main(String[] args) {
//	HashSet<Object> hs=new HashSet<>(0, 0)
Set<Object> ts=new TreeSet<Object>();
ts.add(10);
ts.add(10);
ts.add(10);
Iterator<Object> it = ts.iterator();

LinkedHashSet<Object>ob=new LinkedHashSet<>();
}
}
