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
		System.out.println("--- Manav Otomasyonuna Hoþgeldiniz ---");
		
		System.out.println("Kaç kilo armut alýndý: ");
		a = input.nextInt();
		
		System.out.println("Kaç kilo elma alýndý: ");
		e = input.nextInt();
		
		System.out.println("Kaç kilo domates alýndý: ");
		d = input.nextInt();
		
		System.out.println("Kaç kilo mandalina alýndý: ");
		m = input.nextInt();
		
		System.out.println("Kaç kilo kereviz alýndý: ");
		k = input.nextInt();
		
		double toplamUcret = (armut * a) + (elma * e) + (domates * d) + (mandalina * m) + (kereviz *k);
		
		System.out.println("----------------------------------");
		System.out.println("Toplam ödenecek tutar: "+toplamUcret);
		
	}

}
