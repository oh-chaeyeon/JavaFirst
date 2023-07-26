import java.util.Scanner;
 
public class Main {
    public static void main(String[] args){
        
        Scanner oh = new Scanner(System.in);
        int n1 = oh.nextInt();
        int n2 = oh.nextInt();
        
        System.out.println(n1+n2);
        System.out.println(n1-n2);
        System.out.println(n1*n2);
        System.out.println(n1/n2);
        System.out.println(n1%n2);
        oh.close();
    }
}