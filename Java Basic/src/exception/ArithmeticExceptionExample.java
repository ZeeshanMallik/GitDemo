package exception;

public class ArithmeticExceptionExample{

	
	public static void main(String[] args) {
		
		int i=10;
		int j=0;
		
		try {
			int k=i/j;
			System.out.println(k);
		}catch(ArithmeticException e) {
			
			System.out.println("Cannot divide the number by zero");
		}
		System.out.println("Execution completed");
	}
}
