package manavKasa;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double armut = 2.14;
		double elma = 3.67;
		double domates = 1.11;
		double mandalina = 0.95;
		double kereviz = 5;
		
		int a;
		int e;
		int d;
		int m;
		int k;
		
		Scanner input = new Scanner(System.in);
		System.out.println("--- Manav Otomasyonuna Ho�geldiniz ---");
		
		System.out.println("Ka� kilo armut al�nd�: ");
		a = input.nextInt();
		
		System.out.println("Ka� kilo elma al�nd�: ");
		e = input.nextInt();
		
		System.out.println("Ka� kilo domates al�nd�: ");
		d = input.nextInt();
		
		System.out.println("Ka� kilo mandalina al�nd�: ");
		m = input.nextInt();
		
		System.out.println("Ka� kilo kereviz al�nd�: ");
		k = input.nextInt();
		
		double toplamUcret = (armut * a) + (elma * e) + (domates * d) + (mandalina * m) + (kereviz *k);
		
		System.out.println("----------------------------------");
		System.out.println("Toplam �denecek tutar: "+toplamUcret);
		
	}

}
