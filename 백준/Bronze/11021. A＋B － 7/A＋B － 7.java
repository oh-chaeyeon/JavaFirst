import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
 
		Scanner oh = new Scanner(System.in);
		int num = oh.nextInt();
        
		for (int i = 1; i <= num; i++) {
			int A = oh.nextInt();
			int B = oh.nextInt();
 
			System.out.println("Case #" + i + ": " + (A + B));
		}
 
		oh.close();
	}
}