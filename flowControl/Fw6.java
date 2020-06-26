package flowControl;

public class Fw6 {
	public static void main(String[] args) {
		String a = args[0];
		int b = Integer.parseInt(args[1]);
		if(a.equals("Female") && (b>=1 && b<=58)) {
			System.out.println("the percentage of interest is 8.2%");
		}
		else if(a.equals("Female") && (b>=59 && b<=100)) {
			System.out.println("the percentage of interest is 9.2%");
		}
		else if(a.equals("Male") && (b>=1 && b<=58)) {
			System.out.println("the percentage of interest is 8.4%");
		}
		else if(a.equals("Male") && (b>=59 && b<=100)){
			System.out.println("the percentage of interest is 10.5%");
		}
	}

}
