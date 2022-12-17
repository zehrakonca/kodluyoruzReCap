package vucutKitleEndeksi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		double height;
		int weight;
		double vucutKitleEndeksi;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter your height: ");
		height = input.nextDouble();
		
		System.out.println("enter your weight: ");
		weight = input.nextInt();
		
		vucutKitleEndeksi = weight/(height * height);
		System.out.println("its your result : "+vucutKitleEndeksi);
		

	}

}
