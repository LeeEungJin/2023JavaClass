package JavaClassBasic;

import java.util.Scanner;

public class Quiz3_lotto {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		final int PRICE_PER_LOTTO = 1000; // 로또 단가

		int[] lotto_num = new int[45]; // 로또번호
		int[][] output_num; // 추첨번호
		int inMoney; // 투입금액
		int lottoCnt; // 로또 횟수
		int changeMoney; // 거스름돈
		int temp = 0; // 빈 컵
		int tempIndex = 0;

		int i = 0;
		int j = 0;
		int count = 0;

		System.out.print("금액을 입력 : ");
		inMoney = scanner.nextInt();
		scanner.nextLine();
		lottoCnt = inMoney / PRICE_PER_LOTTO;
		changeMoney = inMoney % PRICE_PER_LOTTO;
		output_num = new int[lottoCnt][6];

		for (i = 0; i < 45; i++) {
			lotto_num[i] = i + 1;
		}

		for (count = 0; count < lottoCnt; count++) {

			for (i = 0; i < 45 * 20; i++) {
				tempIndex = (int) (Math.random() * 45);
				temp = lotto_num[0];
				lotto_num[0] = lotto_num[tempIndex];
				lotto_num[tempIndex] = temp;
			}

			for (i = 0; i < 6; i++) {
				output_num[count][i] = lotto_num[i];
			}
		}

		for (i = 0; i < output_num.length; i++) {
			for (j = 0; j < output_num[i].length; j++) {
				System.out.print(output_num[i][j] + "\t");
			}
			System.out.println();
		}
		System.out.println("거스름 돈 : ￦" + changeMoney);

		scanner.close();

	}

}
