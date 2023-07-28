import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		int n = oh.nextInt();
		oh.close();

		for (int i = 1; i <= 9; ++i) {
			System.out.println(n + " * " + i + " = " + (n * i));
		}
	}
}