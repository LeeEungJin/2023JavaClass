package JavaClassBasic;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int temp = 0;
		boolean check = true;
		int i=0;
		
		temp = scanner.nextInt();
		
		
		for(i=2 ; i<temp ; i++) {
			if(temp%i==0) {
				check = false;
			}
		}
		
		
		if(check) {
			System.out.println("�ڼ��Դϴ�.");
		}
		else {
			System.out.println("�ڼ��� �ƴմϴ�.");
		}
		
		scanner.close();
		
		
	}

}
