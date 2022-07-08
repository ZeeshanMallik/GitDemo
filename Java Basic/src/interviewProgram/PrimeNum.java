package interviewProgram;

public class PrimeNum {

	int num=17;
	public static void main(String[] args) {
		
		isPrime(17);
			}
	
	public static boolean isPrime(int num){
		for(int i=2;i<num; i++){

		if(num%i==0){
		System.out.println("Number is not prime");
		return false;
		}
		}
		
		System.out.print("Number is Prime");
		return true;
		}

}
