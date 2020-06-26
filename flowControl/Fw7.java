package flowControl;
import java.util.*;
public class Fw7 {
	public static void main(String args[]) {
		Scanner s= new Scanner(System.in);
		char a = s.next().charAt(0);
		if(Character.isUpperCase(a)) {
			System.out.println(a+"->"+Character.toLowerCase(a));
		}
		else {
			System.out.println(a+"->"+Character.toUpperCase(a));
		}
	}
}
