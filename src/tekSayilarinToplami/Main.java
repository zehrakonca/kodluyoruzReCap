package tekSayilarinToplami;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		int total = 0;
		
		Scanner input = new Scanner(System.in);
		
//		do
//		{
//			System.out.println("please enter a number:");
//			n= input.nextInt();
//			if(n % 2 == 1) {
//				total += n;
//			}
//		}
//		while (n > 0);
		
		do {
			System.out.println("please enter a number");
			n= input.nextInt();
			if(n % 4 == 0) {
				total += n;
			}
		}
		while (n % 2 == 0);
		
		System.out.println("total: " + total);
	}

}
