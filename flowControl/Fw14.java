package flowControl;
import java.util.*;
public class Fw14 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int l = String.valueOf(a).length();
		int sum =0,t;
		for(int i =0;i<l;i++) {
			t = a%10;
			a = a/10;
			sum += t;
		}
		System.out.println(sum);
	}

}
