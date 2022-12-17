package havaDurumu;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int heat; 
		
		Scanner input = new Scanner(System.in);
		System.out.println("how is weather today? please enter C degree.(for example: 27) ");
		heat = input.nextInt();
		
		if(heat <5 ) {
			System.out.println("you can do ski or if it's snowing in your city, you can play snowball with friends.");
		}
		else if((heat>=5) && (heat<=15)) {
			System.out.println("you can go to the cinema.");
		}
		else if((heat>=15) && (heat<=25)) {
			System.out.println("you can go to the picnic or you can go to for a walk. you lucky. weather is great.");
		}
		else if(heat > 25) {
			System.out.println("weather is great today!! dont think too much and take the your swimsuit and go to the swim.");
		}
		else {
			System.out.println("there is no such thing.");
		}

	}

}
