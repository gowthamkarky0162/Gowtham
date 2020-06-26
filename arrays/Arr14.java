package arrays;

public class Arr14 {
	public static void main(String args[]) {
		int arr[][]=new int[3][3];
		int c=0;
		if(args.length<9) {
			System.out.println("please enter 9 integer numbers");
		}
		else {
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					arr[i][j] =Integer.parseInt(args[c++]);
					
				}
			}
			System.out.println("The given array is:");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println("");
			}
			int max =0;
			System.out.print("The biggest number in the given array is:");
			for(int i=0;i<3;i++) {
				for(int j=0;j<3;j++) {
				 if(arr[i][j]>max)
					 max = arr[i][j];
				}
			}
			System.out.println(max);
		}
	}
}
