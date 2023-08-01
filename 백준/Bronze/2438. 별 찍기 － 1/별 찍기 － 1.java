import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
 
		Scanner oh = new Scanner(System.in);
		int num = oh.nextInt();
        
		for (int i = 1; i <= num; i++) {
			for(int j=0;j<i;j++){
		        System.out.print("*");
	        }
	        System.out.println("");
		}
		oh.close();
	}
}