package notOrtalamasi;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		 int mat, fizik, kimya, turkce, tarih, muzik;


	        Scanner input = new Scanner(System.in);
	        System.out.print("Matematik Notunuz :");
	        mat= input.nextInt();


	        System.out.print("fizik Notunuz :");
	        fizik= input.nextInt();
  

	        System.out.print("kimya Notunuz :");
	        kimya= input.nextInt();


	        System.out.print("turkce Notunuz :");
	        turkce= input.nextInt();


	        System.out.print("tarih Notunuz :");
	        tarih= input.nextInt();


	        System.out.print("muzik Notunuz :");
	        muzik= input.nextInt();

	        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
	        double ortalama = toplam/6.0;

	        String str =(ortalama>=60 )?"GEÇTÝ":"KALDI";
	        System.out.println("DURUM : " + str);


	}

}
