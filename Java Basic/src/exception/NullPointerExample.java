package exception;


public class NullPointerExample {

	
	public static void main(String[] args) {
		
		
		try {
			String name =  null;
			System.out.println("name: " +name);	
			System.out.println(name.length());
			
		}catch(NullPointerException e) {
		
			System.out.println(e);
		}
		System.out.println("Execution completed");
		
		printMessage("Exception happen");
		
	}

	private static void printMessage(String string) {
		
		System.out.println(string);
		
	}
	
}
