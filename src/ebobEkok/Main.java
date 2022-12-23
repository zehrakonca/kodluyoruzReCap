package ebobEkok;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter a first number: ");
		int n1= input.nextInt();
		
		System.out.println("please enter a second number: ");
		int n2= input.nextInt();
		
		int ebob=1;
		int ekok=0;
		int i=1;
		
		while(i<= n1 && i<= n2) {
			if(i % n1 == 0 && i % n2 == 0) {
				ebob = i;
				
			}
			i++;
		}
		i++;
		System.out.println("Ebob: : "+ebob);
		
		ekok = n1 * n2 / ebob;
		System.out.println("Ekok: "+ekok);
		
//		for(int k = n1; k>=1; k--) {
//			if(n1 % k == 0 && n2 % k == 0) {
//				ebob = k; 
//				System.out.println("Ebob: : "+k);
//				break;
//			}
//		}
//		
//		for(int i=1; i<=(n1*n2); i++) {
//			if(i % n1 == 0 && i % n2 == 0) {
//				System.out.println("Ekok: "+i);
//				break;
//			}
//		}
	}
}

