package basics;

public class CallByValReference {

	int a;
	int b;
	
	public static void main(String[] args) {
		
		CallByValReference obj = new CallByValReference();
		
		int x=30;
		int y=40;
		obj.add(x,y);
		obj.a=100;
		obj.b=200;
		
		obj.swap(obj);
		
		System.out.println(obj.a);
		System.out.println(obj.b);
		
	}
	
	public int add(int a , int b) {
		int c= a+b;
		return c;
	}
	
	public void swap(CallByValReference t) {
		
		int temp;
		temp=t.a;
		t.a=t.b;
		t.b=temp;
		
	}
	
}
