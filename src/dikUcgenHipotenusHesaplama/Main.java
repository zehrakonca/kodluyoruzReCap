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

	        System.out.print("1. kenarýn uzunluðunu giriniz: ");
	        edge1 = input.nextInt();
	        System.out.print("1. kenarýn uzunluðunu giriniz:  ");
	        edge2 = input.nextInt();

	        edge3 = Math.sqrt((edge1*edge1)+(edge2*edge2));

	        u = (edge1+edge2+edge3)/2;
	        perimeter = 2*u;
	        area = Math.sqrt(u*(u-edge1)*(u-edge2)*(u-edge3));

	        System.out.println("---------------------------------");
	        System.out.println("Hipotenüs Uzunluðu : "+edge3);
	        System.out.println("Çevre : "+perimeter);
	        System.out.println("Alan : "+area);

	}

}
