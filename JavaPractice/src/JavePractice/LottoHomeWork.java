package JavePractice;

import java.util.Scanner;

public class LottoHomeWork {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int money = 0;
		int change = 0;
		int temp = 0;
		boolean check = true;
		int count = 0;

		int[][] Lotto;

		int i = 0;
		int j = 0;
		int k = 0;

		System.out.print("얼마치 사시겠습니까? ");
		money = scanner.nextInt();
		temp = money / 1000;
		change = money - (temp * 1000);

		Lotto = new int[temp][6];

		for (i = 0; i < temp; i++) {
			for (j = 0; j < 6; j++) {
				Lotto[i][j] = (int)((Math.random() * 45)+1);
				for(k=0 ; k<j ; k++) {
					if(Lotto[i][j] == Lotto[i][k]) {
						j = j-1;
					}
				}
			}
		}

		for (i = 0; i < temp; i++) {
			for (j = 0; j < 6; j++) {
				System.out.print(Lotto[i][j] + " ");
			}
			System.out.print("\n");
		}

		switch (change % 1000) {
		case 0:
			break;
		default:
			System.out.print("\n거스름 돈 ￦ ");
			System.out.println(change);
			break;
		}

		scanner.close();
	}

}
