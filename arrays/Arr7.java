package arrays;
import java.util.*;
public class Arr7 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n= s.nextInt();
        int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		for(int i=0;i<n-1;i++) {
			if(arr[i]!=arr[i+1]) {
				System.out.println(arr[i]+" ");
			}
		}
		System.out.print(arr[n-1]);
		
	}
}
