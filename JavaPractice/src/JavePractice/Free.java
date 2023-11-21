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

		System.out.println("국어 영어 수학 과학 점수를 입력하시오");
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
		System.out.println("국어 : " + score_kor);
		System.out.println("영어 : " + score_english);
		System.out.println("수학 : " + score_math);
		System.out.println("과학 : " + score_science);
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + average);
		System.out.println("등급 : " + grade);

		scanner.close();
	}
}