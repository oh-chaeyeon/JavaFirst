import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        
	Scanner oh = new Scanner(System.in);
    int a = oh.nextInt();
    int b = oh.nextInt();
    int c = oh.nextInt();
        
    System.out.println((a+b)%c);
    System.out.println(((a%c) + (b%c))%c);
    System.out.println((a*b)%c);
    System.out.println(((a%c)*(b%c))%c);
        
    
    }
}