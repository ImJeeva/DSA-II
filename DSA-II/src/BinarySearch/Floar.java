package BinarySearch;

import java.util.Scanner;

public class Floar {
	
	static int floar(int [] arr, int k) {
		int low = 0, high = arr.length-1, mid = 0;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if( k == arr[mid]) {
				return mid;
			}
			else if(k < arr[mid] ) {
				high = mid -1;
			}
			else {
				low = mid +1;
			}
		}
		if(high >= 0) {
			return arr[high];
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int[n];
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(floar(arr, k));

	}

}
