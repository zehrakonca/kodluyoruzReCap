package dikUcgenHipotenusHesaplama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);

	        int edge1;
	        int edge2;
	        double edge3;
	        double u;
	        double perimeter;
	        double area;

	        System.out.print("1. kenar�n uzunlu�unu giriniz: ");
	        edge1 = input.nextInt();
	        System.out.print("1. kenar�n uzunlu�unu giriniz:  ");
	        edge2 = input.nextInt();

	        edge3 = Math.sqrt((edge1*edge1)+(edge2*edge2));

	        u = (edge1+edge2+edge3)/2;
	        perimeter = 2*u;
	        area = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));

	        System.out.println("---------------------------------");
	        System.out.println("Hipoten�s Uzunlu�u : "+edge3);
	        System.out.println("�evre : "+perimeter);
	        System.out.println("Alan : "+area);

	}

}
