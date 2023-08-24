import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        boolean[] isPrime = new boolean[1000001];
        for (int i = 2; i <= 1000000; i++) {
            isPrime[i] = true;
        }

        // 에라토스테네스의 체 알고리즘으로 소수 구하기
        for (int i = 2; i * i <= 1000000; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= 1000000; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        while (T-- > 0) {
            int n = Integer.parseInt(br.readLine());
            int count = 0;

            // n을 두 소수의 합으로 나타내는 방법 세기
            for (int i = 2; i <= n / 2; i++) {
                if (isPrime[i] && isPrime[n - i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}