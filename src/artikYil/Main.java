package artikYil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int yil;
	        Scanner input = new Scanner(System.in);
	        System.out.printf("L�tfen y�l giriniz:");
	        yil = input.nextInt();

	        if(yil % 100 ==0){
	            if(yil % 400 ==0){
	                System.out.println(yil + "Bir Art�k Y�ld�r!");

	            }else{
	                System.out.println(yil + "Bir Art�k Y�l De�ildir!!");
	            }
	        }else if(yil % 4 == 0){
	            System.out.println(yil+ "Bir Art�k Y�ld�r!");
	        }
	        else{
	            System.out.println(yil + "Bir Art�k Y�l De�ildir!!");
	        }

	}

}
