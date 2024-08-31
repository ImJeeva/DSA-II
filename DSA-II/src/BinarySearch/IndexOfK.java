package BinarySearch;

import java.util.Scanner;



public class IndexOfK {
	
	static int inedxOfK(int [] arr, int k) {
		int low = 0, high = arr.length-1, mid = 0;
		
		while(low <= high) {
			mid = (low + high) / 2;
			if(k == arr[mid]) {
				return mid;
			}
			else if(k < arr[mid]) {
				high = mid -1;  // If K - value less than mid - value, high - value change to mid - value -1.
				/* low = low; */
			}
			else {
				low = mid +1; // Else if K - value greater than mid - value, mid - value change to mid - value +1.
				
			}
		}
			
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int [n];
		for(int i = 0 ; i < arr.length ;i ++) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		System.out.println(inedxOfK(arr,k));
	}

}
