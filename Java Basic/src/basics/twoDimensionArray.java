package basics;

public class twoDimensionArray {

	
	public static void main(String[] args) {
		
		String x[][] = new String [3][4];
		
		
		System.out.println(x.length);
		System.out.println(x[1].length);
		
		
		x[0][0]="A0";
		x[0][1]="A1";
		x[0][2]="A2";
		x[0][3]="A3";
		
		x[1][0]="B0";
		x[1][1]="B1";
		x[1][2]="B2";
		x[1][3]="B3";
		
		x[2][0]="C0";
		x[2][1]="C1";
		x[2][2]="C2";
		x[2][3]="C3";
		
		//System.out.println(x[2][3]);
		
		for(int row=0; row<x.length; row++) {
			
			for(int col =0; col< x[0].length; col++) {
			
				System.out.println(x[row][col]);
			}
		}
		
	}
}
