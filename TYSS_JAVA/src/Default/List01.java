package Default;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class List01 {
public static void main(String[] args) {
//	ArrayList< Object> a1=new ArrayList<Object>();
//	a1.add(10);
//	a1.add(10.2);
//	a1.add('A');
//	a1.add("Abhi");
//	a1.add(10.8D);
//	
//	ArrayList< Integer> a2=new ArrayList<Integer>();
//	a2.add(5);
//	a2.add(15);
//	a2.add(25);
//	
//	System.out.println(a1);
//	System.out.println(a2);
//	
//	Collections.sort(a2);
//	
//	Object ob[]= {10,10.2,'a',"ara"};
//	for(int i=0;i<ob.length;i++) {
//		System.out.println(ob[i]);
//		
//	}
//	
//	int a=(int) ob[0];
//	
//	LinkedList<Object> ll=new LinkedList<Object>();
	
	Queue<Object> pq=new PriorityQueue<Object>();
	pq.add(10);
	pq.add(15);
	pq.add(10);
	pq.add(20);
	System.out.println(pq);
	
}
}
