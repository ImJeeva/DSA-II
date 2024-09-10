package BinarySearch;

import java.util.Scanner;

public class FirstListPositionOFK {

	static void firstLastIndexOfK(int[] arr, int k) {
		int l = 0, m = 0, h = arr.length - 1;
		int[] res = { -1, -1 };
		//Finding the starting index (Left side) of - k value;
		while (l <= h) {
			m = (l + h) / 2;
			if (k == arr[m]) {
				res[0] = m;
				h = m - 1;
			} else if (k < arr[m]) {
				h = m - 1;
			} else {
				l = m + 1;

			}
		}
		//Reallocate the value;
		l = 0;
		m = 0;
		h = arr.length - 1;

		//Finding the ending index (Right side) of - k value;

		while (l <= h) {
			m = (l + h) / 2;
			if (k == arr[m]) {
				res[1] = m;
				l = m + 1;
			} else if (k < arr[m]) {
				h = m - 1;
			} else {
				l = m + 1;

			}
		}
		for (int i = 0; i < res.length; i++) {
			System.out.print(res[i] + " ");
		}

	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int[] arr = new int[n];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		int k = scan.nextInt();
		firstLastIndexOfK(arr, k);

	}

}
