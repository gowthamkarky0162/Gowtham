package arrays;
import java.util.*;
public class Arr8 {
	static int index(int[] arr,int n,int g) {
		int  b  = 0;
		for(int i=0;i<n;i++) {
			if(arr[i]==g) {
				b =  i;
				break;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int sum =0;
		if(index(arr,n,6)<index(arr,n,7)) {
			for(int i=0;i<n;i++) {
				if(i<index(arr,n,6) || i>index(arr,n,7)) {
					sum += arr[i];
				}
			}
		}
		else {
			for(int i=0;i<n;i++) {
				sum += arr[i];
			}
		}
		System.out.println(sum);
	}
}
