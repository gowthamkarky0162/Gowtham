package arrays;
import java.util.Arrays;
import java.util.Scanner;
public class Arr2 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		Arrays.sort(arr);
		System.out.println("max value "+arr[n-1]+"\nmin value "+arr[0]);
	}
}
