package kdvTutarHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		double tutar; 
		double kdvOrani;
		double kdvTutari;
		double kdvOran1 = 0.18;
		double kdvOran2 = 0.08;
		double toplamTutar;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Ücret tutarýný giriniz: ");
		tutar = input.nextDouble();
		
//		double kdvTutar = tutar * kdvOran1;
//		double kdvliTutar = tutar + kdvTutar;
		
		kdvOrani = tutar < 1000? kdvOran1 : kdvOran2;
		kdvTutari = tutar < 1000? tutar* kdvOran1 : tutar * kdvOran2;
		toplamTutar = tutar + kdvTutari;
		
		System.out.println("Kdv'siz Tutar: " + tutar);
		System.out.println("Kdv Oraný : " +kdvOrani);
		System.out.println("Kdv'li tutar: " +toplamTutar);
		
		

	}

}
