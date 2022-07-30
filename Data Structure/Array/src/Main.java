import java.util.Arrays;

public class Main {
	public static void main(String[] args) {
		// try array of primitive types
		int[] arr1 = new int[10];
		int[] arr2 = {1, 2, 3};
		int[] arr3 = new int[] {1,2,3};
		
		Arrays.fill(arr1, 1, 10, 9);
		print(arr1);
		
		Arrays.sort(arr1, 0, 10);

		print(arr1);
		
		Arrays.asList(arr2);
		Arrays.asList(new int[]{1,2,3});
	}
	
	private static void print(int[] arr) {
		for(int i: arr) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
