package basics;

public class ConstructorExample {

	
	public ConstructorExample() {
		System.out.println("Inside the constructor");
	}
	
	public ConstructorExample(String name) {
		System.out.println("Inside the constructor: " + name);
	}
	
	public static void main(String[] args) {
		
		ConstructorExample c =new ConstructorExample();
		ConstructorExample c1=new ConstructorExample("Zeeshan");
	}
	
	
}
