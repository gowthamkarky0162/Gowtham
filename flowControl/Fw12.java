package flowControl;
import java.util.*;
public class Fw12 {
	static boolean prime(int a) {
		int f =1;
		for(int i = 2;i < a ;i++ ) {
			if(a%i==0) {
				f =0;
			}
		}
		if(f==1)
			return true;
		else
			return false;
	}
	public static void main (String[] args) {
		Scanner s = new Scanner(System.in);
		int d = s.nextInt();
		if(prime(d)) {
			System.out.println("It is Prime");
		}
		else {
			System.out.println("It is not Prime");
		}
	}
}
