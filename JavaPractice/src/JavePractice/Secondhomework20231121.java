/*
���� ���� �� ���α׷��� �ۼ��Ͻÿ�

��ǻ�ʹ� �̹� ���߽��ϴ�.
����� ������?
1.���� 2.���� 3.��
���� : 1
��ǻ�� : ����
����� : ����
�����ϴ�.

 */


package JavePractice;
import java.util.Scanner;

public class Secondhomework20231121 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		int computer=2;
		int human=0;
	
		System.out.printf("��ǻ�ʹ� �̹� ���߽��ϴ�.\n�����Ͻÿ�.\n1.���� 2.���� 3.��\n");
		
		human = scanner.nextInt();
		
		if(human == computer) {
			System.out.println("�����ϴ�.");
		}
		
		
		
	
		scanner.close();
	}
	
}
