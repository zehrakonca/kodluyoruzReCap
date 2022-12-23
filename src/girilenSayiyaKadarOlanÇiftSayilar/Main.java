package girilenSayiyaKadarOlan«iftSayilar;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int n;
		double sum = 0;
		double total = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("please enter number: ");
		n = input.nextInt();
		
		for (int i=1; i<=n; i++) {
			if(i % 2 == 0) {
				System.out.println(i);
			}
		}
		
		for(int i=0; i<=n; i++) {
			if(i % 12 == 0)
			{
				System.out.println(i);
				total = total + i;
				n++;
			}
		}
		sum= total/n;
		
		if(total!=0) {
			System.out.println("sum of numbers divisible by 3 and 4 : "+sum);
		}
		else {
			System.out.println("your entered number no divisible by 3 and 4.");
		}
		

	}

}
