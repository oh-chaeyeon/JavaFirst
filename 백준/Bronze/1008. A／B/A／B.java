import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        
        Scanner oh = new Scanner(System.in);
        double n1 = oh.nextDouble();
        double n2 = oh.nextDouble();
        
        System.out.println(n1/n2);
        oh.close();
    }
}