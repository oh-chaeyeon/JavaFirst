import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		
		int num = oh.nextInt();
		String str = "";
		oh.close();
		
		for(int i=1; i<=num/4; i++) {
			str += "long ";
		}
        
		System.out.println(str + "int");

	}
}