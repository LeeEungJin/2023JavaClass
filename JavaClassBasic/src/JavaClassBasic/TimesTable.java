package JavaClassBasic;

public class TimesTable {
	public static void main(String[] args) {
		int dan = 2;
		int gop = 1;
		String result = "";
		
		
		for(gop=1 ; gop<10 ; gop++) {
			result = result + ("2 * " + gop + " = " + (dan * gop) + "\n");
		}
		
		System.out.println(result);
		
	}

}
