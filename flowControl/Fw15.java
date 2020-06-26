package flowControl;

public class Fw15 {

	public static void main(String[] args) {
		if(args.length==0) {
			System.out.println("please enter an integer number");
		}
		else {
			int l = Integer.parseInt(args[0]);
			for(int i=0;i<l;i++) {
				for(int j=0;j<i+1;j++) {
					System.out.print("* ");
				}
				System.out.println("");
			}
		}

	}

}
