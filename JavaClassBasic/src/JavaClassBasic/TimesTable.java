package JavaClassBasic;

public class TimesTable {
	public static void main(String[] args) {
		
		int dan = 0;
		int gop = 0;
		
		String result = "";
		
		for (gop = 1 ; gop < 10 ; gop++) {
			for (dan = 2 ; dan < 10 ; dan++ ) {
				result = result + dan + "*" + gop + "=" + (dan*gop) +"\t";
			}
			result = result + "\n";
		}
		
		System.out.println(result);
		
	}

}
