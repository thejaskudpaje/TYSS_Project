package Array;

public class FirstMinNumberInAnArray {
public static void main(String[] args) {
int ar[]= {10,15,2,5,8,9};
	
	int min=ar[0];
	for(int i=1;i<ar.length;i++) {
		if(ar[i]<min) {
			min=ar[i];
		}
	}
	System.out.println(min);
}
}

