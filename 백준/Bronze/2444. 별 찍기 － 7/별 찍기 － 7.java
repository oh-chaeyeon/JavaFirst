import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); 

        // 위쪽 삼각형 출력
        for (int i = 1; i <= N; i++) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // 아래쪽 삼각형 출력
        for (int i = N - 1; i >= 1; i--) {
            for (int j = N - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2 * i - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        oh.close();
    }
}