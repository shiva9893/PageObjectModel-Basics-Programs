package Practice;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		/*
		 * Scanner sn=new Scanner(System.in);
		 * 
		 * System.out.println("Enter a number to find the factorial");
		 * 
		 * int n=sn.nextInt();
		 */
		int n = 4;
		long fact = factorial(n);
		System.out.println(fact);

		/*
		 * int fact=1;
		 * 
		 * for(int i=1;i<=n;i++) { fact=fact*(i);
		 * 
		 * }
		 * 
		 * 
		 * System.out.println(fact);
		 */

	}

	public static long factorial(int n) {

		if (n >= 1) {
			return n * factorial(n - 1);
		} else {
			return 1;
		}
	}

}
