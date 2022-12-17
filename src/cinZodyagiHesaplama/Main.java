package cinZodyagiHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 int yil, kalan;
	        Scanner mec = new Scanner(System.in);

	        System.out.print("Doðum yýlýnýzý giriniz: ");
	        yil = mec.nextInt();
	        kalan = yil % 12;
	        switch (kalan) {
	            case 0:
	                System.out.print("Çin Zodyaðý Burcunuz: Maymun");
	                break;
	            case 1:
	                System.out.print("Çin Zodyaðý Burcunuz: Horoz");
	                break;
	            case 2:
	                System.out.print("Çin Zodyaðý Burcunuz: Köpek");
	                break;
	            case 3:
	                System.out.print("Çin Zodyaðý Burcunuz: Domuz");
	                break;
	            case 4:
	                System.out.print("Çin Zodyaðý Burcunuz: Fare");
	                break;
	            case 5:
	                System.out.print("Çin Zodyaðý Burcunuz: Öküz");
	                break;
	            case 6:
	                System.out.print("Çin Zodyaðý Burcunuz: Kaplan");
	                break;
	            case 7:
	                System.out.print("Çin Zodyaðý Burcunuz: Tavþan");
	                break;
	            case 8:
	                System.out.print("Çin Zodyaðý Burcunuz: Ejderha");
	                break;
	            case 9:
	                System.out.print("Çin Zodyaðý Burcunuz: Yýlan");
	                break;
	            case 10:
	                System.out.print("Çin Zodyaðý Burcunuz: At");
	                break;
	            case 11:
	                System.out.print("Çin Zodyaðý Burcunuz: Koyun");
	                break;

	        }

	}

}
