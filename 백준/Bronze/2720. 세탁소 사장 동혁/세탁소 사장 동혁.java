import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int T = oh.nextInt(); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            int cents = oh.nextInt(); // 거스름돈 (단위: 센트)

            int quarters = cents / 25; // 25센트 동전 개수
            cents %= 25; // 25센트 동전을 제외한 나머지

            int dimes = cents / 10; // 10센트 동전 개수
            cents %= 10; // 10센트 동전을 제외한 나머지

            int nickels = cents / 5; // 5센트 동전 개수
            cents %= 5; // 5센트 동전을 제외한 나머지

            int pennies = cents; // 1센트 동전 개수

            System.out.println(quarters + " " + dimes + " " + nickels + " " + pennies);
        }

        oh.close();
    }
}