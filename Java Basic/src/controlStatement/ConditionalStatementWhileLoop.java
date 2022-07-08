package controlStatement;

import java.util.Scanner;

public class ConditionalStatementWhileLoop {

	
	public static void main(String[] args) {
		
		
		Scanner inn = new Scanner(System.in);
		String cmd="yes";
		
		int age[]=new int[3];
		age[0]=23;
		age[1]=24;
		age[2]=27;
		
		for(int i=0; i<3; i++) {
			System.out.println(age[i]);
		}
		while(cmd.equals("yes")) {
			
			System.out.println("Enter the amount");
			int amount=inn.nextInt();
			System.out.println("Please collecte the amount: " + amount);
			
			System.out.println("Do you want to continue ?(yes/no)");
			
			cmd=inn.next();
			
			
			
		}
		
	}
}
