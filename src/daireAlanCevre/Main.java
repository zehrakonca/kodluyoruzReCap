package daireAlanCevre;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		double r;
		double pi = 3.14;
		double a;
		
		Scanner input=new Scanner(System.in);
	    System.out.println("Dairenin Yar��ap�n� Giriniz : ");
	    r=input.nextDouble();
	    
	    System.out.println("Alan�n� ��renmek �stedi�iniz Dilimin A��s�n� Giriniz");
	    a=input.nextDouble();
	      
	    System.out.println("Dairenin �evresi: "+2*pi*r);
	    System.out.println("Dairenin T�m Alan�: "+pi*r*r);
	    System.out.println(a+" Dereceli Daire Diliminin Alan�: "+pi*r*r*a/360);

	}

}
