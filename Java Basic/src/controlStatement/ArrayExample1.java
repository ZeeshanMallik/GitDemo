package controlStatement;

public class ArrayExample1 {

	
	
	public static void main(String[] args) {
		
		int a[] = new int[3];
		ArrayExample1 res=new ArrayExample1();
		a=res.arrayMethod();
		
		for(int j : a) {
			System.out.println(j);
		}
		
		
	}
	public int[] arrayMethod() {
		
		int res[] = new int[3];
		res[0]=25;
		res[1]=45;
		res[2]=99;
		
		return res;
	}
}
