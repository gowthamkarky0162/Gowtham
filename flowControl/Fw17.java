package flowControl;

public class Fw17 {

	public static void main(String[] args) {
		String d = args[0];
		StringBuffer g =new StringBuffer(d);
		g.reverse();
		if(d.equals(g.toString())) {
			System.out.println(d+" is a palindrome");
		}
		else {
			System.out.println(d+" is not a palindrome");
		}
	}

}
