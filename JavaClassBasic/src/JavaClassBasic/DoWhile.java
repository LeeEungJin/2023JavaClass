package JavaClassBasic;

import java.util.Scanner;

public class DoWhile {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		int temp = 0;

		while (temp < 10) {
			System.out.println(temp);
			temp++;
		}
		scanner.close();

	}

}
