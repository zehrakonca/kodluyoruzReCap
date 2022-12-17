package ucakBileti;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 	int km, age, type;
	        double Nfiyat, yasIndirimi, tarife, indirimliFiyat, toplam = 0;

	        Scanner input = new Scanner(System.in);
	        System.out.print("Mesafeyi km cinsinden giriniz:");
	        km = input.nextInt();

	        System.out.print( "Yaşınız:");
	        age = input.nextInt();

	        System.out.println( "Tek yön:1 , Gidiş/Dönüş:2");
	        System.out.print( "Tarife seçiniz: ");
	        type = input.nextInt();

	        if(((type == 1)||(type == 2)) && (age > 0) && (km > 0)) {
	            Nfiyat = km * 0.10;
	            if(age < 12) {
	                yasIndirimi = Nfiyat * 0.50;
	                indirimliFiyat = Nfiyat - yasIndirimi;
	                toplam = indirimliFiyat;
	                if(type == 2) {
	                    tarife = indirimliFiyat * 0.20;
	                    toplam = (indirimliFiyat - tarife) * 2;
	                }
	                System.out.print("Toplam tutar:" + toplam);
	            } else if((age < 24) && (age > 12)) {
	                yasIndirimi = Nfiyat * 0.10;
	                indirimliFiyat = Nfiyat - yasIndirimi;
	                toplam = indirimliFiyat;
	                if(type == 2) {
	                    tarife = indirimliFiyat * 0.20;
	                    toplam = (indirimliFiyat - tarife) * 2;
	            }
	                System.out.print("Toplam tutar:" + toplam);
	            } else if(age > 65) {
	                yasIndirimi = Nfiyat * 0.30;
	                indirimliFiyat = Nfiyat - yasIndirimi;
	                toplam = indirimliFiyat;
	                if(type == 2) {
	                    tarife = indirimliFiyat * 0.20;
	                    toplam = (indirimliFiyat - tarife) * 2;
	                }
	                System.out.print("Toplam tutar:" + toplam);
	            }else if((age>24)&&(age < 65)){
	                toplam = Nfiyat;
	            }if(type == 2) {
	                toplam = Nfiyat * 2;
	            }
	            System.out.print("Toplam tutar:" + toplam);
	        } else {
	            System.out.print( "Hatalı giriş yaptınız!");
	        }

	}

}
