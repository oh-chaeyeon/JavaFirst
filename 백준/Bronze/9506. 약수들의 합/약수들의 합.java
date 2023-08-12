import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        while (true) {
            int n = oh.nextInt(); // 주어진 수

            if (n == -1) {
                break; // 입력이 -1인 경우 종료
            }

            int sum = 0; // 약수의 합을 계산할 변수

            for (int i = 1; i < n; i++) {
                if (n % i == 0) {
                    sum += i; // 약수의 합에 i를 더함
                }
            }

            if (sum == n) {
                System.out.print(n + " = 1"); // 완전수인 경우
                for (int i = 2; i < n; i++) {
                    if (n % i == 0) {
                        System.out.print(" + " + i);
                    }
                }
                System.out.println();
            } else {
                System.out.println(n + " is NOT perfect.");
            }
        }
        oh.close();
    }
}