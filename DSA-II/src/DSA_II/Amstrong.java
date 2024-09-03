package DSA_II;

import java.util.Scanner;

public class Amstrong {

		static void amstrong(int n) {
			int tem = n;
			int sum = 0;
			int a = String.valueOf(n).length();
			
			while(n > 0) {
				
				sum += Math.pow(n % 10, a);
				n = n/10;
			}
			if(sum == tem) {
				System.out.println("Amstrong");
			}
			else {
				System.out.println("Not Amstring");
			}
			
		}
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		amstrong(n);

	}

}
