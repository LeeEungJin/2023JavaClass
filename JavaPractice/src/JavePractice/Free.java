package JavePractice;

import java.util.Scanner;

public class Free {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int score_kor = 0;
		int score_math = 0;
		int score_science = 0;
		int score_english = 0;
		int total = 0;
		float average = 0;
		char grade = 0;

		System.out.println("���� ���� ���� ���� ������ �Է��Ͻÿ�");
		score_kor = scanner.nextInt();
		score_english = scanner.nextInt();
		score_math = scanner.nextInt();
		score_science = scanner.nextInt();
		total = score_kor + score_english + score_math + score_science;
		average = (int) ((total * 100 / 4) / 10) / 10f;

		if (average >= 90) {
			grade = 'A';
		}

		else if (average >= 80) {
			grade = 'B';
		}
		
		else if (average >= 70) {
			grade = 'C';
		}
		
		else if (average >= 60) {
			grade = 'D';
		}
		
		else if (average < 60) {
			grade = 'F';
		}

		System.out.println("");
		System.out.println("���� : " + score_kor);
		System.out.println("���� : " + score_english);
		System.out.println("���� : " + score_math);
		System.out.println("���� : " + score_science);
		System.out.println("���� : " + total);
		System.out.println("��� : " + average);
		System.out.println("��� : " + grade);

		scanner.close();
	}
}