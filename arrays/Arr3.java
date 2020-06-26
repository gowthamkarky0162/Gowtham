package arrays;
import java.util.Scanner;
public class Arr3 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=s.nextInt();
		}
		int g = s.nextInt(),c=0;
		for(int i=0;i<n;i++) {
			if(g==arr[i]) {
				System.out.println(i);
				break;
			}
			else {
				c++;
			}
		}
		if(c==arr.length) {
			System.out.println("-1");
		}
	}
}
