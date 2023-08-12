import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        while (true) {
            int a = oh.nextInt(); // 첫 번째 수
            int b = oh.nextInt(); // 두 번째 수

            if (a == 0 && b == 0) {
                break; // 두 수가 모두 0이면 종료
            }

            if (b % a == 0) {
                System.out.println("factor");
            } else if (a % b == 0) {
                System.out.println("multiple");
            } else {
                System.out.println("neither");
            }
        }
        oh.close();
    }
}