package yildiz;

import java.util.Scanner;

public class TersUcgen {

	public static void main(String[] args) {
		
		  Scanner input = new Scanner(System.in);
	        System.out.println("please enter a number for reverse triangle:");
	        int n = input.nextInt();
	        for (int i = n - 1; i >= 1; i--) {

	            for (int k = 1; k <= (n - i); k++) {
	                System.out.print(" ");
	            }
	            for (int j = 1; j <= (2 * i) - 1; j++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	            System.out.println();
	        }
	}

