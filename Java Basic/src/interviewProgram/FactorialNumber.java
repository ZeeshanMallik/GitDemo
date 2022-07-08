package interviewProgram;

public class FactorialNumber {

	public static void main(String[] args) {
		
		int num =8;
		int temp=1;
		
		while(num>0) {
			
			temp=temp*num;
			num--;
			
		}
		System.out.println(temp);
	}
}
