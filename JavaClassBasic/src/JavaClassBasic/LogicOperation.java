package JavaClassBasic;

public class LogicOperation {

	public static void main(String[] args) {
		int a = 0;
		int b = 0;
		int c = 0;

		boolean result;

		result = ((a = 1) < (b = 2)) || ((c = 3) > 2);

		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);

	}

}
