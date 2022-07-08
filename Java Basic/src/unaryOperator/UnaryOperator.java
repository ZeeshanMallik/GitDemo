package unaryOperator;

public class UnaryOperator {

	public static void main(String[] args) {
		
		int i=0;
		int j=i++ + i++;	//0+1
		
		System.out.println(i); //2
		System.out.println(j); //1
		
		
		
		int k=10;
		int p=++k + k++ + ++k;  // 11+11+12+
		System.out.println(k); //11
		System.out.println(p); //11
		
		// post and pre decrement
		
		int a=20;
		int b=a-- + --a;
		System.out.println(a); 
		System.out.println(b);
	}

}
