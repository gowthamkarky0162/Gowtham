package flowControl;
import java.util.*;
public class Fw13 {
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
	public static void main(String[] args) {
		for(int i=10;i<=99;i++) {
			if(prime(i)) {
				System.out.print(i+" ");
			}
		}
	}

}
