package flowControl;
import java.util.*;
public class Fw5 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		char input1  = s.next().charAt(0);
		if((input1>=65 && input1<=90)||(input1>=97 && input1<=122)) {
			System.out.println("Alphabet");
		}
		else if(input1>=48 && input1<=57) {
			System.out.println("Digit");
		}
		else {
			System.out.println("Special Character");
		}
	}

}
