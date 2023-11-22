package JavaClassBasic;

import java.util.Scanner;

public class Astric {
	public static void main(String[] args) {
		
		int i=0;
		String result = "";
		
		System.out.print("정수 입력 : ");
		Scanner scanner = new Scanner(System.in);
		
		
		int inputNum = scanner.nextInt();
		
		for(i=0 ; i<inputNum ; i++) {
			result = result +"*";
		}
		
		System.out.println(result);
		
		scanner.close();
	}
}
