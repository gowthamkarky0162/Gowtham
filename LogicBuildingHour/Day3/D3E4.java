package logicBuildingHour;
import java.util.*;
public class D3E4 {
	public static int secLast(int n) {
		int v = 0; 
		if(String.valueOf(n).length()<2) {
			return -1;
		}
		else {
			v = n%100;
			return v/10;
		}
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(secLast(Math.abs(s.nextInt())));
	}

}
