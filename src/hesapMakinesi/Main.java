package hesapMakinesi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int number1;
		int number2;
		int select;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("�lk say�: ");
		number1= input.nextInt();
		
		System.out.println("ikinci say�: ");
		number2= input.nextInt();
		
		System.out.println("---------------------------");
		System.out.println("Yap�lacak i�lemi se�iniz\n"
				+ "1 - Toplama\n"
				+ "2 - ��karma\n"
				+ "3 - �arpma\n"
				+ "4 - B�lme");
		System.out.println("---------------------------");
		
		select = input.nextInt();
		
		switch (select) {
		case 1 :
			System.out.println("Toplam sonucu : " + (number1+number2));
			break;
		case 2 :
			System.out.println("��karma sonucu: " + (number1>number2? "number1-number2": "number2-number1"));
			break;
		case 3 :
			System.out.println("�arpma sonucu: " +(number1*number2));
			break;
		case 4 :
			System.out.println("B�lme sonucu: " +(number1>number2? (number2!=0? number1/number2:"Bir sayi sifir'a b�l�nmez"):(number1!=0? number2/number1:"Bir sayi sifi'a b�l�nmez")));
			break;
		default:
			break;
		}
		
	}

}
