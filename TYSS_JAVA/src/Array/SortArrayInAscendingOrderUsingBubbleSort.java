package Array;

public class SortArrayInAscendingOrderUsingBubbleSort {
public static void main(String[] args) {
	int ar[]= {10,10,15,8,6,9};
	System.out.println("before sorting");
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	
	for(int i=0;i<ar.length;i++) {	
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;			
			}
		}
	}
	System.out.println("after sorting");
	for(int i=0;i<ar.length;i++) {
		System.out.println(ar[i]);
	}
	
	
}
}
