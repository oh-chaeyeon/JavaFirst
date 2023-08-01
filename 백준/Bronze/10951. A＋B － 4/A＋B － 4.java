import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		
		Scanner oh =new Scanner(System.in);
			
		while(oh.hasNextInt()){
		
			int A=oh.nextInt();
			int B=oh.nextInt();
			System.out.println(A+B);
		
		}	
		oh.close();
	}
}
 