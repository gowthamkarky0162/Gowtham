package flowControl;

public class Fw9 {
	public static void main(String[] args) {
		String[] m = {"0","January","February","March","April","May",
				"June","July","August","September","October","November","December"};
		if(args.length == 0) {
			System.out.println("Please enter the month in numbers");
		}
		else if(Integer.parseInt(args[0])>12) {
			System.out.println("Invalid month");
		}
		else {
			System.out.println(m[Integer.parseInt(args[0])]);
		}
	}
}
