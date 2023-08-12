import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int M = oh.nextInt(); // 범위의 시작값
        int N = oh.nextInt(); // 범위의 끝값

        int sum = 0; // 소수의 합을 계산할 변수
        int minPrime = Integer.MAX_VALUE; // 최솟값을 찾기 위한 변수

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) {
                sum += i; // 소수의 합에 i를 더함
                minPrime = Math.min(minPrime, i); // 최솟값 갱신
            }
        }

        if (sum == 0) {
            System.out.println(-1); // 소수가 없는 경우
        } else {
            System.out.println(sum);
            System.out.println(minPrime);
        }

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