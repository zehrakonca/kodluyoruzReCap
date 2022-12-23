package üslüSayi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("exponential number to be processed: ");
		int n = input.nextInt();
		
		System.out.println("exponential number: ");
		int k = input.nextInt();
		
		int total = 1;
		
		int i = 1;
		while (i <= k) {
			total *= n; 
			i++;
		}
		
		for(int j =1; j<=k; j++) {
			total*=n;
		}
		
		
		System.out.println("total of exponential: " +total);
	}

}
