import java.util.Scanner;
 
public class Main {
	public static void main(String args[]){
		Scanner oh =new Scanner(System.in);
        
		while(true){
		
			int A=oh.nextInt();
			int B=oh.nextInt();
		
			if(A==0 && B==0){
				oh.close();
				break;
			}
			System.out.println(A+B);
		}
	}
}