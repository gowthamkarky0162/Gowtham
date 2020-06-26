package arrays;

public class Arr13 {
	public static void main(String args[]) {
		int arr[][]=new int[2][2];
		if(args.length<4) {
			System.out.println("please enter 4 integer numbers");
		}
		else {
			arr[0][0]=Integer.parseInt(args[0]);
			arr[0][1]=Integer.parseInt(args[1]);
			arr[1][0]=Integer.parseInt(args[2]);
			arr[1][1]=Integer.parseInt(args[3]);
			System.out.println("The given array is:");
			for(int i=0;i<2;i++) {
				for(int j=0;j<2;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			System.out.println("The reverse of the array is:");
			for(int i=1;i>=0;i--) {
				for(int j=1;j>=0;j--) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
		}
	}
}
