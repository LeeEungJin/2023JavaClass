package JavaClassBasic;
import java.util.Scanner;

public class JavaClassSecondhomework {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int computerNumber=0;
		double random = Math.random();
		int humanNumber=0;
		int fight=0;
		
		System.out.println("1.���� 2.���� 3.��");
		humanNumber = scanner.nextInt();
		humanNumber = humanNumber-1;
		
		computerNumber=(int)(random*3);
		
		fight = humanNumber - computerNumber;
		
		if(computerNumber==0) {
			System.out.println("��ǻ���� ���� : ����");
		}
		else if(computerNumber==1) {
			System.out.println("��ǻ���� ���� : ����");
		}
		else {
			System.out.println("��ǻ���� ���� : ��");
		}
		
		if(humanNumber==0) {
			System.out.println("����� ���� : ����");
		}
		else if(humanNumber==1) {
			System.out.println("����� ���� : ����");
		}
		else {
			System.out.println("����� ���� : ��");			
		}
		
		if (humanNumber==computerNumber) {
			System.out.println("���º��Դϴ�.");
		}
		else if (fight==1 || fight==-2) {
			System.out.println("����� �¸��Դϴ�.");
		}
		else {
			System.out.println("����� �й��Դϴ�.");
		}
		
		
		scanner.close();
	}

}
