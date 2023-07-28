import java.util.Scanner;
 
public class Main {
    public static void main(String[] args) {
        
        Scanner oh = new Scanner(System.in);
 
        int A = oh.nextInt();
        int B = oh.nextInt();
        int C = oh.nextInt();
 
        int min = 60 * A + B;  
        min += C;
 
        int hour = (min / 60) % 24;
        int minute = min % 60;
 
        System.out.println(hour + " " + minute);
 
    }
}