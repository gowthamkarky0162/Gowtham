package arrays;
import java.util.*;
public class Arr11 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i] = s.nextInt();
		}
		int c=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==1 || arr[i]==4)
				c++;
		}
		if(c==arr.length)
			System.out.println(true);
		else
			System.out.println(false);
	}
}
