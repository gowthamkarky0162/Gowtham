package flowControl;
import java.util.*;
public class Fw4 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char a = s.next().charAt(0);
		char b = s.next().charAt(0);
		if((int)a<(int)b) {
			System.out.println(a+","+b);
		}
		else {
			System.out.println(b+","+a);
		}
		
	}

}
