package exception;

public class ArrayIndexExceptionExample {

	
	public static void main(String[] args) {
		
		int[] a = new int[3];
		try {
			a[0]=10;
			a[1]=20;
			a[2]=40;	
			System.out.println(a[0]);
			System.out.println(a[1]);
			System.out.println(a[2]);	
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Exceeding the size of the array");
		}
		
		System.out.println("Execution completed");
	}
}
