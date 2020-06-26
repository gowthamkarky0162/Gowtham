package flowControl;
import java.util.*;
public class Fw16 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		int a = s.nextInt();
		int l = String.valueOf(a).length();
		int t;
        for(int i=0;i<l;i++) {
        	System.out.print(a%10);
			a = a/10;
			}
	}

}
