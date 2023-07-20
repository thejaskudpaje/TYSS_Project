package Array;

public class AdditionOfArray {
public static void main(String[] args) {
	int a[]= {4,2,5,1};
	int b[]= {3,1,6,4,3};
	int len;
	if(a.length>b.length) {
		len=a.length;
	}
	else if(a.length<b.length) {
		len=b.length;
	}
	else
		len=a.length;
	//System.out.println(len);
	
	int c[]=new int[len];
	for(int i=0;i<len;i++) {
		try {
		c[i]=a[i]+b[i];
		}
		catch(Exception e){
			if(a.length>b.length) {
				c[i]=a[i];
			}
			if(a.length<b.length) {
				c[i]=b[i];
			}
		}
		
	}
	
	for(int i=0;i<len;i++ ) {
		System.out.println(c[i]);
	}
}
}
