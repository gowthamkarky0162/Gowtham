package logicBuildingHour;
import java.util.*;
public class D3E3 {
    public static int lastDigit(int n) { 
    	return n%10;
    }
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(lastDigit(Math.abs(s.nextInt())));

	}

}
