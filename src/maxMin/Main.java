package maxMin;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("how many numbers will be ranked? : ");
		int count= input.nextInt();
		
		int max = 0;
		int min = 0;
		
		for(int i=1; i<=count; i++) {
			System.out.println(i +".entered number: ");
			int n= input.nextInt();
			if(n > max) {
				max = n;
			}
			else if(n < min) {
				min = n;
			}
		}

		System.out.println("minimum value you entered: "+min);
		System.out.println("maximum value you entered: "+max);

	}

}
