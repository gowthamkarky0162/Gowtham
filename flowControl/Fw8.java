package flowControl;
import java.util.*;
public class Fw8 {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		char a = s.next().charAt(0);
		switch(a) {
		case 'R':
			System.out.println("Red");
			break;
		case 'B':
			System.out.println("Blue");
			break;
		case 'O':
			System.out.println("Orange");
			break;
		case 'Y':
			System.out.println("Yellow");
			break;
		case 'W':
			System.out.println("White");
			break;
		default:
			System.out.println("Invalid code");
			break;
		}
	}

}
