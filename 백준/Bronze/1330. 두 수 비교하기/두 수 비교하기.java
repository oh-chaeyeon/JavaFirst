import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		
		int A = oh.nextInt();
		int B = oh.nextInt();
		
		oh.close();
        
		if(A>B) 
            System.out.println(">");
		else if(A<B) 
            System.out.println("<");
		else 
            System.out.println("==");
 
	}
 
}