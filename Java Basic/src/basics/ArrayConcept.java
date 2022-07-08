package basics;

public class ArrayConcept {

	public static void main(String[] args) {
		
		
		int a[] = new int[5];
		a[0]=200;
		a[1]=400;
		a[2]=600;
		a[3]=800;
		a[4]=1000;
		System.out.println(a[2]);
		System.out.println(a.length);

		char c[]=new char[3];
		c[1]='a';
		c[2]='b';
		
		String s[]=new String[3];
		s[1]="Zeeshan";
		s[2]="Malik";
		System.out.println(s.length);
		System.out.println(s[2]);
		
		for(int i=0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		
		Object ob[]=new Object[5];
		ob[0]="Tom";
		ob[1]=15;
		ob[2]="17/09/1996";
		ob[3]='A';
		ob[4]="London";
		
		
		System.out.println(ob[4]);
		
		
			
	}
}
