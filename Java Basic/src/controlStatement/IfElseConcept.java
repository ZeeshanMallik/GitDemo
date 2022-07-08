package controlStatement;

public class IfElseConcept {

	
	public static void main(String[] args) {
		
		int a=100;
		int b=20;
		
		if(a>b) {
			System.out.println("A is greater than B");
		}else {
			System.out.println("B is greater than A");
		}
		
		int x=100;
		int y=200;
		int z=400;
		
		if(x>y & x>z) {
			System.out.println("X is greater");
		}else if(y>z) {
			System.out.println("Y is greater");
		}else {
			System.out.println("Z is greater");
		}
		
	}
}
