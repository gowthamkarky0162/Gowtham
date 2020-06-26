package arrays;
import java.util.*;
public class Arr9 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		int b;
		for(int i=0;i<n;i++) {
			b = s.nextInt();
			if(b==10)
				arr[i] = 0;
			else
				arr[i] = b;
		}
		for(int i=0;i<n;i++) {
			if(arr[i]!=0)
				System.out.print(arr[i]+" ");
		}
		for(int i=0;i<n;i++) {
			if(arr[i]==0)
				System.out.print(arr[i]+" ");
		}
		
	}
}
