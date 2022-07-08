package interviewProgram;

public class PrimeNumber {

	
	public static void main(String[] args) {
		
		int num = 21;
		int flag=0;
		
		for(int i=2;i<num;i++) {
			
			if(num%2==0) {
				System.out.println(num + " Is not a prime number");
				flag=1;
				break;
			}
		}
		if(flag==0) {
			System.out.println(num + " Is a prime number");
		}
	}
}

