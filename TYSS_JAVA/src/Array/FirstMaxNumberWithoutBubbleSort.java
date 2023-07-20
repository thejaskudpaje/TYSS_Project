package Array;

public class FirstMaxNumberWithoutBubbleSort {
public static void main(String[] args) {
int ar[]= {10,15,2,5,8,9};
	
	int max=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i]>max) {
			max=ar[i];
		}
	}
	System.out.println(max);
}
}

