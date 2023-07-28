import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner oh = new Scanner(System.in)) {
            int num = oh.nextInt();

            int sum = 0;
            for (int i = 1; i <= num; i++) {
                sum += i;
            }
            System.out.println(sum);
        }
    }
}
