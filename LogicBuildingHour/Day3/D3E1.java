package logicBuildingHour;
import java.util.*;
public class D3E1 {
 public static int isEven(int n) {
	 if(n%2==0)
		 return 2;
	 else
		 return 1;
 }
	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		int a = s.nextInt();
		System.out.println(isEven(a));
	}

}
