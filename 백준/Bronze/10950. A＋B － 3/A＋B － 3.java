import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner oh = new Scanner(System.in);

		int num = oh.nextInt();
		
		for (int i = 0; i < num; i++) {
			int n1 = oh.nextInt();
			int n2 = oh.nextInt();
			System.out.println(n1+n2);
		}
		
	}
}