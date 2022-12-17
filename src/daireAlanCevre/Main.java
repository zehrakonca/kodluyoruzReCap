package daireAlanCevre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r;
		double pi = 3.14;
		double a;
		
		Scanner input=new Scanner(System.in);
	    System.out.println("Dairenin Yarýçapýný Giriniz : ");
	    r=input.nextDouble();
	    
	    System.out.println("Alanýný Öðrenmek Ýstediðiniz Dilimin Açýsýný Giriniz");
	    a=input.nextDouble();
	      
	    System.out.println("Dairenin Çevresi: "+2*pi*r);
	    System.out.println("Dairenin Tüm Alaný: "+pi*r*r);
	    System.out.println(a+" Dereceli Daire Diliminin Alaný: "+pi*r*r*a/360);

	}

}
