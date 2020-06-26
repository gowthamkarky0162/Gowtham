package arrays;

import java.util.Scanner;

public class Arr12 {
	public static void main(String args[]) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr1[]=new int[n];
		int arr2[]=new int[n];
		int mid1[]=new int[2];
		for(int i=0;i<n;i++) {
			arr1[i] = s.nextInt();
		}
		for(int i=0;i<n;i++) {
			arr2[i] = s.nextInt();
		}
		double mid = Math.floor((double)n/2);
		mid1[0] = arr1[(int)mid];
		mid1[1] = arr2[(int)mid];
		System.out.println(mid1[0]+" "+mid1[1]);
	}
}
