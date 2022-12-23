package armstrongSayisi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.print("please enter a number:");
		int number = input.nextInt();
		int tempNumber= number;
		int basValue;
		int total = 0;
		
		while(tempNumber!=0) {
			basValue = tempNumber%10;
			total = basValue + total;
			tempNumber/=10;
		}
		System.out.println("entered number: "+ number +"\nthe sum of the digits of the entered number: "+total);
	}

}
