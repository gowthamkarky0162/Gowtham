package arrays;
import java.util.*;
public class Arr5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("Largest 2 numbers ->"+arr[n-2]+","+arr[n-1]+"\nSmallest 2 numbers->"+arr[0]+","+arr[1]);
	}
}
