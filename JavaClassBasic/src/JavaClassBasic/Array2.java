package JavaClassBasic;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("학생 수 : ");
		
		int StudentTemp = scanner.nextInt(); scanner.nextLine();
		
		String[] label = { "순번", "이름", "국어", "영어", "수학", "과학", "총점", "평균" };
		
		int[] StudentNum = new int[StudentTemp];
		String[] StudentName = new String[StudentTemp];
		int[] ScoreKor = new int[StudentTemp];
		int[] ScoreEng = new int[StudentTemp];
		int[] ScoreMat = new int[StudentTemp];
		int[] ScoreSci = new int[StudentTemp];
		int[] ScoreTotal = new int[StudentTemp];
		float[] ScoreAve = new float[StudentTemp];
		
		int i=0;
		int j=0;		
		
		for (i=0 ; i<StudentTemp ; i++) {
			System.out.println("학생 " + (i+1) + " 정보 입력");
			System.out.print("이름 : ");
			StudentName[i] = scanner.nextLine();
			System.out.print("국어 : ");
			ScoreKor[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("영어 : ");
			ScoreEng[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("수학 : ");
			ScoreMat[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("과학 : ");
			ScoreSci[i] = scanner.nextInt(); scanner.nextLine();
		}
		
		for (i = 0; i < StudentTemp ; i++) {
			StudentNum[i] = i;
			ScoreTotal[i] = ScoreKor[i] + ScoreEng[i] + ScoreMat[i] + ScoreSci[i];
			ScoreAve[i] = (int) ((ScoreTotal[i] / (float) 4) * 100 + 0.5f) / 100f;
		}

		for (i = 0; i < label.length; i++) {
			System.out.print(label[i] + "\t");
		}
		System.out.println("");

		for (i = 0; i < StudentTemp ; i++) {
			System.out.println(StudentNum[i] + "\t" + StudentName[i] + "\t" + ScoreKor[i] + "\t" + ScoreEng[i] + "\t" + ScoreMat[i] + "\t"
					+ ScoreSci[i] + "\t" + ScoreTotal[i] + "\t" + ScoreAve[i]);
		}
		
		scanner.close();
	}
}