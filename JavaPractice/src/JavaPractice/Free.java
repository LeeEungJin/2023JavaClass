/*
package JavaPractice;
import java.util.Scanner;

public class Free {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("Hi");
		
		
		scanner.close();
		
	}

}

*/

package JavaPractice;
import java.util.Scanner;

public class Free{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int input = 0;

		int output1000 = 0;
		int output100 = 0;
		int output10 = 0;
		int output1 = 0;

		System.out.printf("정수 입력 : ");
		input = scanner.nextInt();

		output1000 = input / 1000;
		output100 = input / 100 - output1000 * 10;
		output10 = input / 10 - output1000 * 100 - output100 * 10;
		output1 = input / 1 - output1000 * 1000 - output100 * 100 - output10 * 10;

		System.out.println("4자리 숫자 : " + output1000);
		System.out.println("3자리 숫자 : " + output100);
		System.out.println("2자리 숫자 : " + output10);
		System.out.println("1자리 숫자 : " + output1);


		scanner.close();
	}
}


