package basics;

public class ThisConstructorExample {

	public ThisConstructorExample() {
		System.out.println("I am calling from constructor without argument");
	}
	
	public ThisConstructorExample(String name) {
		this();
		System.out.println("I am calling from constructor with argument");
	}
	
	public static void main(String[] args) {
		
		ThisConstructorExample c = new ThisConstructorExample("Zeeshan");
	}
}

