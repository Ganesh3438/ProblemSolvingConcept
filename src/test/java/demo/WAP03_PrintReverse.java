package demo;

import java.util.Scanner;

public class WAP03_PrintReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		
		while(n>0) {
			int rem = n % 10;
			System.out.print(rem);
			n = n / 10;
		}
		
	}

}
