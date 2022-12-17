package artikYil;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int yil;
	        Scanner input = new Scanner(System.in);
	        System.out.printf("Lütfen yýl giriniz:");
	        yil = input.nextInt();

	        if(yil % 100 ==0){
	            if(yil % 400 ==0){
	                System.out.println(yil + "Bir Artýk Yýldýr!");

	            }else{
	                System.out.println(yil + "Bir Artýk Yýl Deðildir!!");
	            }
	        }else if(yil % 4 == 0){
	            System.out.println(yil+ "Bir Artýk Yýldýr!");
	        }
	        else{
	            System.out.println(yil + "Bir Artýk Yýl Deðildir!!");
	        }

	}

}
