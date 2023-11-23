package JavaClassBasic;

public class Array {
	public static void main(String[] args) {
		int[] a = new int[10];
		int i = 0;
		
		for(i=0 ; i < a.length ; i++) {
			a[i] = i+1 ;
		}
		
		System.out.println(a[8]);
		
	}
}
