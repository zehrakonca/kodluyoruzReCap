package ikininKuvvetleri;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int n;
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a limit number:");
		n = input.nextInt();
		
//		for(int i = 1; i<=n; i*=2) {
//			System.out.println(i);
//		}
		
		for(int i=1; i<=n; i*=4) {
			System.out.println("multiple of 4: "+i);
		}
		
		System.out.println("-------------------------------");
		
		for(int i=1; i<=n; i*=5) {
			System.out.println("multiple of 5: "+i);
		}

	}

}
