package logicBuildingHour;
import java.util.*;
public class D3E5 {
	public static int lastSum(int n,int m) {
		return (n%10)+(m%10);
	}
	public static void main(String[] args) {
		Scanner  s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		System.out.println(lastSum(Math.abs(a),Math.abs(b)));
	}

}
