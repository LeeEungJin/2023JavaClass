package JavaClassBasic;

import java.util.Scanner;

public class Array2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("�л� �� : ");
		
		int StudentTemp = scanner.nextInt(); scanner.nextLine();
		
		String[] label = { "����", "�̸�", "����", "����", "����", "����", "����", "���" };
		
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
			System.out.println("�л� " + (i+1) + " ���� �Է�");
			System.out.print("�̸� : ");
			StudentName[i] = scanner.nextLine();
			System.out.print("���� : ");
			ScoreKor[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("���� : ");
			ScoreEng[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("���� : ");
			ScoreMat[i] = scanner.nextInt(); scanner.nextLine();
			System.out.print("���� : ");
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