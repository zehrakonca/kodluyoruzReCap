package faktoriyel;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
//		System.out.println("factorial number: ");
//		int n= input.nextInt();
//
//		for(int i=1; i<=n; i++) {
//			total = total * i;
//		}
//		System.out.println(n + "! = "+ total);
		
		int c,n,r,k; 
		
		System.out.println("factorial number: ");
		n= input.nextInt();
		System.out.println("Combination number: ");
		r= input.nextInt();
		k= n-r;
		
		int factorial = 1;
		for(int  i=1; i<=n; i++) {
			factorial = i*factorial;
		}
		
		int combination = 1; 
		for(int  i=1; i<=r; i++) {
			combination = i*combination;
		}
		
		int extraction=1;
		for(int  i=1; i<=k; i++) {
			factorial = i*factorial;
		}
		
		c= factorial / (combination*extraction);
		
		System.out.println(n +" combination of "+r+" = " +c);
	}
	
	

}
