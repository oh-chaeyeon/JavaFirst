import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 숫자의 개수
        int count = 0; // 소수의 개수

        for (int i = 0; i < N; i++) {
            int num = oh.nextInt(); // 숫자 입력

            if (isPrime(num)) {
                count++; // 소수인 경우 개수 증가
            }
        }

        System.out.println(count);

        oh.close();
    }

    // 소수 판별 함수
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        if (num <= 3) {
            return true;
        }
        if (num % 2 == 0 || num % 3 == 0) {
            return false;
        }

        // 5부터 시작해서 6씩 증가하는 수들을 확인
        for (int i = 5; i * i <= num; i += 6) {
            if (num % i == 0 || num % (i + 2) == 0) {
                return false;
            }
        }
        return true;
    }
}