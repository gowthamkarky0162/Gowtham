package arrays;
public class Arr4 {
	public static void main(String[] args) {
		int arr[] = new int[95];
		int b = 32;
		for(int i=0;i<95;i++) {
			arr[i] = b;
			b++;
		}
		for(int i=0;i<95;i++) {
			System.out.print((char)arr[i]+" ");
		}
	}
}
