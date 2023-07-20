package Array;

public class FirstMinNumberWithoutBubbleSort {
public static void main(String[] args) {
	int ar[]= {10,10,15,8,6,9};
	for(int i=0;i<ar.length;i++) {	
		for(int j=i+1;j<ar.length;j++) {
			if(ar[i]>ar[j]) {
				int temp=ar[i];
				ar[i]=ar[j];
				ar[j]=temp;			
			}
		}
	}
	System.out.println(ar[0]);
}
}
