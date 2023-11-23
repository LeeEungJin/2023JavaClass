package JavaClassBasic;

import java.util.Scanner;

public class DoubleArray {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		final int STUDENT_NUM;
		final int SUBJECT_NUM;
		
		String[] name;
		String[] subject;
		int[][] score;
		int[] total;
		float[] ave;
		
		int i = 0;
		int j = 0;
		
		System.out.print("�л� �� : ");
		STUDENT_NUM = scanner.nextInt(); scanner.nextLine();
		
		System.out.print("���� �� : ");
		SUBJECT_NUM = scanner.nextInt(); scanner.nextLine();
		
		name = new String[STUDENT_NUM];
		subject = new String[SUBJECT_NUM];
		score = new int[STUDENT_NUM][SUBJECT_NUM];
		total = new int[STUDENT_NUM];
		ave = new float[STUDENT_NUM];
		
		
		
		for(i=0 ; i<SUBJECT_NUM ; i++) {
			System.out.print((i+1) + "/" + SUBJECT_NUM + "��° ����� : ");
			subject[i] = scanner.nextLine();
		}
		
		System.out.println("");
		
		for (i=0 ; i<STUDENT_NUM ; i++) {
			System.out.print(i+1 +"��° �̸� : ");
			name[i] = scanner.nextLine();
			for (j=0 ; j<SUBJECT_NUM ; j++) {
				System.out.print(name[i] + "�� " + subject[j] + "���� : ");
				score[i][j] = scanner.nextInt(); scanner.nextLine();
			}
			System.out.println("");
		}
		
		for (i=0 ; i< STUDENT_NUM ; i++) {
			for (j=0 ; j<SUBJECT_NUM ; j++) {
				total[i] = total[i] + score[i][j];
			}
			ave[i] = (int)(((total[i]/(float)SUBJECT_NUM*1000+5)/10)/100f);
		}
		
		System.out.print("����\t�̸�\t");
		for (i=0 ; i<SUBJECT_NUM ; i++) {
			System.out.print(subject[i]+"\t");
		}
		System.out.println("����\t���");
		
		for (i=0 ; i<STUDENT_NUM ; i++) {
			System.out.print((i+1) + "\t" + name[i] + "\t");
			for(j=0 ; j<SUBJECT_NUM ; j++) {
				System.out.print(score[i][j] + "\t");
			}
			System.out.println(total[i] + "\t" + ave[i]);
		}
		
		scanner.close();
		
	}

}
