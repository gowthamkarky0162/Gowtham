package arrays;
import java.util.*;
public class Arr1 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int sum = 0;
		for(int i=0;i<n;i++){
			sum += arr[i];
		}
		float avg = sum/n;
		System.out.println("sum is "+sum);
		System.out.println("avg is "+avg);
	}

}
