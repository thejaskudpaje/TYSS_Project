package Array;

public class FirstAndSecondMaxNumberWithoutBBLSort {
public static void main(String[] args) {
	int a[]= {1,1,1,2,8,14,1};
	int fmax=a[0];
	int smax=a[0];
	for(int i=0;i<a.length;i++) {
		if(a[i]>=fmax) {
			if(a[i]>fmax) {
				smax=fmax;
			}
			fmax=a[i];
		}
		else if(fmax==smax || smax<a[i]) {
			smax=a[i];
		}
		
	}
	
	System.out.println(fmax);
	System.out.println(smax);
}
}
