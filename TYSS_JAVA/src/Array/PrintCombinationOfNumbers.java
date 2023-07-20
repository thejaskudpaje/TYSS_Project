package Array;

public class PrintCombinationOfNumbers {
public static void main(String[] args) {
	int a[]= {9,7,8,5,2,4,4,3,6};//11
	
	for(int i=0;i<a.length;i++) {
		for(int j=i+1;j<a.length;j++) {
			if(a[i]+a[j]==11) {
				System.out.println(a[i]+"+"+a[j]+"=11");
				break;//if we have the duplicate values it will give the duplicate result. thats why we should use break here.
			}
		}
	}
}
}
