package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("İlk sayı: ");
		number1= input.nextInt();
		
		System.out.println("ikinci sayı: ");
		number2= input.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("Yapılacak işlemi seçiniz\n"
				+ "1 - Toplama\n"
				+ "2 - Çıkarma\n"
				+ "3 - Çarpma\n"
				+ "4 - Bölme");
		System.out.println("---------------------------");
		
		select = input.nextInt();
		
		switch (select) {
		case 1 :
			System.out.println("Toplam sonucu : " + (number1+number2));
			break;
		case 2 :
			System.out.println("Çıkarma sonucu: " + (number1>number2? "number1-number2": "number2-number1"));
			break;
		case 3 :
			System.out.println("Çarpma sonucu: " +(number1*number2));
			break;
		case 4 :
			System.out.println("Bölme sonucu: " +(number1>number2? (number2!=0? number1/number2:"Bir sayi sifir'a bölünmez"):(number1!=0? number2/number1:"Bir sayi sifi'a bölünmez")));
			break;
		default:
			break;
		}
		
	}

}
