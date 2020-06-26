package flowControl;
import java.util.*;
public class Fw1b {
	static boolean lastDigit(String a,String b) {
		if(a.charAt(a.length()-1)==b.charAt(b.length()-1)) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner s=new Scanner(System.in);
		String a = s.next();
		String b = s.next();
		System.out.println(lastDigit(a,b));
	}
}
