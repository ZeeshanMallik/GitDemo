package basics;

public class ThisKeywordExample {

	
	
	public void test() {
		System.out.println(this);
	}
	public static void main(String[] args) {
		
		ThisKeywordExample  a = new ThisKeywordExample();
		System.out.println(a);
		a.test();
	}

}
