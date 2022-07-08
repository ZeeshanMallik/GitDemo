package controlStatement;

import java.util.Scanner;

public class ConditionalStatament {

	
	public static void main(String[] args) {
		
		
		Scanner in = new Scanner(System.in);
		
		for(int i=0; i<3; i++) {
			System.out.println("Enter the pin number");
			
			int pinNumber=in.nextInt();
			
			if(pinNumber==1234) {
				System.out.println("Welcome");
				break;
			}else {
				System.out.println("InvaLid pin number");
			}
			
			if(i==2) {
				System.out.println("Card is blockedß");
			}
		}
	}
}
