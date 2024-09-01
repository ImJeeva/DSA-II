package DSA_II;



import java.util.HashSet;
import java.util.Scanner;

// Question: Find the lonely integer in an array that value not have a pair.

public class UniqueElement {
	static void UElement(int[] arr) {

		HashSet<Integer> h = new HashSet<Integer>();
		for (int i : arr) {
			if (h.contains(i)) {
				h.remove(i); // If number already present that will remove from HashSet.
			} else {
				h.add(i); 
			}
		}
		for (int x : h) {
			System.out.println(x);
		}
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];

		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		UElement(arr);
	}
}
