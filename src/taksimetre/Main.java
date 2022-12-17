package taksimetre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int km;
		int acilisUcret = 10;
		double kmUcreti = 2.20;
		double ucret;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Mesafeyi km cinsinden giriniz: ");
		km = input.nextInt();
		
		ucret = (km * kmUcreti) + acilisUcret;
		
		ucret = (ucret < 20)? 20 : ucret;
		
		System.out.println("Ödenecek Tutar: "+ucret);

	}

}
