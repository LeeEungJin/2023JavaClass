package JavaClassBasic;
import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int computerNumber=0;
		double random = Math.random();
		int humanNumber=0;
		int fight=0;
		
		System.out.println("1.가위 2.바위 3.보");
		humanNumber = scanner.nextInt();
		humanNumber = humanNumber-1;
		
		computerNumber=(int)(random*3);
		
		fight = humanNumber - computerNumber;
		
		if(computerNumber==0) {
			System.out.println("컴퓨터의 선택 : 가위");
		}
		else if(computerNumber==1) {
			System.out.println("컴퓨터의 선택 : 바위");
		}
		else {
			System.out.println("컴퓨터의 선택 : 보");
		}
		
		if(humanNumber==0) {
			System.out.println("당신의 선택 : 가위");
		}
		else if(humanNumber==1) {
			System.out.println("당신의 선택 : 바위");
		}
		else {
			System.out.println("당신의 선택 : 보");			
		}
		
		if (humanNumber==computerNumber) {
			System.out.println("무승부입니다.");
		}
		else if (fight==1 || fight==-2) {
			System.out.println("당신의 승리입니다.");
		}
		else {
			System.out.println("당신의 패배입니다.");
		}
		
		
		scanner.close();
	}

}
