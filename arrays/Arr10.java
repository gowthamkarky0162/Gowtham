package arrays;
import java.util.*;
public class Arr10 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0)
				System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(arr[i]%2!=0)
				System.out.print(arr[i]+" ");
		}
	}
}
