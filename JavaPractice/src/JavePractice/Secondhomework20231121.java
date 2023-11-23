/*
가위 바위 보 프로그램을 작성하시오

컴퓨터는 이미 정했습니다.
당신의 선택은?
1.가위 2.바위 3.보
선택 : 1
컴퓨터 : 바위
사용자 : 가위
졌습니다.

 */


package JavePractice;
import java.util.Scanner;

public class Secondhomework20231121 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int computer=2;
		int human=0;
	
		System.out.printf("컴퓨터는 이미 정했습니다.\n선택하시오.\n1.가위 2.바위 3.보\n");
		
		human = scanner.nextInt();
		
		if(human == computer) {
			System.out.println("비겼습니다.");
		}
		
		
		
	
		scanner.close();
	}
	
}
