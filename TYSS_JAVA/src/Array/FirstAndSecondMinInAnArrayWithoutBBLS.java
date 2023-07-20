package Array;

public class FirstAndSecondMinInAnArrayWithoutBBLS {
public static void main(String[] args) {
	int ar[]= {1,1,8,2,3,1};

int fmin=ar[0];
int smin=ar[0];
for(int i=0;i<ar.length;i++){//
	if(ar[i]<=fmin) {
		if(ar[i]<fmin) {
			smin=fmin;
		}
		fmin=ar[i];
	}
	else if(fmin==smin || smin>ar[i]) {
		smin=ar[i];
	}
}
System.out.println(fmin);//
System.out.println(smin);//
}
}

