import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        while (T-- > 0) {
            long num = Long.parseLong(br.readLine());
            System.out.println(findNextPrime(num));
        }

        br.close();
    }

    // 주어진 숫자보다 크거나 같은 다음 소수를 찾는 함수
    private static long findNextPrime(long num) {
        while (true) {
            if (isPrime(num)) {
                return num;
            }
            num++;
        }
    }

    // 소수를 판별하는 함수
    private static boolean isPrime(long num) {
        if (num <= 1) {
            return false;
        }
        if (num == 2 || num == 3) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (long i = 3; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}