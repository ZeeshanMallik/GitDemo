package exception;

public class A extends ClassNotfoundExample{

	public static void main(String[] args) {
	
		try {
			A a = (A) new ClassNotfoundExample();
			a.test();	
		}catch(ClassCastException e) {
			System.out.println(e);
		}
		System.out.println("Execution completed");
	}
}
