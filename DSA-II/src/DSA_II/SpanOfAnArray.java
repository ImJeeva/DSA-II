package DSA_II;

import java.util.Scanner;

//Question: Find the Span of an Array.

public class SpanOfAnArray {
	
	static int spanOfAnArray(int [] arr) {
		int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ;i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
			if(max < arr[i]) {
				max = arr[i];
			}
		}
		return max - min;
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int [] arr = new int [n];
		
		for(int i = 0 ; i < arr.length ; i ++) {
			arr[i] = scan.nextInt();
			
		}
		
		System.out.println(spanOfAnArray(arr));

	}

}
