package sinifGecme;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int math; 
		int literature;
		int physics;
		int chemical;
		int music;
		
		int grade; 
		int sum; 
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter your math grade: ");
		math = input.nextInt();
		checkGrade(math);
		
		System.out.println("please enter your literature grade: ");
		literature = input.nextInt();
		checkGrade(literature);
		
		System.out.println("please enter your physics grade:");
		physics = input.nextInt();
		checkGrade(physics);
		
		System.out.println("please enter your chemical grade: ");
		chemical = input.nextInt();
		checkGrade(chemical);
		
		System.out.println("please enter your music grade: ");
		music = input.nextInt();
		checkGrade(music);
		
		sum = (math + physics + literature + chemical + music) / 5;
		
		if(sum < 55 ) {
			System.out.println("you failed. it's your total grade.: "+sum);
		}
		else {
			System.out.println("you passed. it's your total grade:  "+sum);
		}
		
	}
	
		static boolean checkGrade(int grade) {
		if(!(grade<=1) && (grade>100)) {
			System.out.println("please enter valid grade. for example(1-100)");
		}
		return true;
	}

}
