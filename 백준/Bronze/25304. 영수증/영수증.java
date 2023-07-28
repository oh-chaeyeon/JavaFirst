import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int T = oh .nextInt(); 
        int num = oh .nextInt();
        int total = 0;

        for(int i = 0; i < num; i++){
            int a = oh.nextInt(); 
            int b = oh.nextInt(); 
            total += a * b;
        }
        
        if(total == T){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}