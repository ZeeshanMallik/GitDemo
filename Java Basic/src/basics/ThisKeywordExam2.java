package basics;

public class ThisKeywordExam2 {

	
	public void test1() {
		
		System.out.println("I am calling from test 1 method");
	}
	
	public  void test2() {
		
		System.out.println("I am calling from test 2 method");
		this.test1();
	}
	public static void main(String[] args) {
		
		ThisKeywordExam2 t = new ThisKeywordExam2();
		t.test2();
		
	}
	
}
