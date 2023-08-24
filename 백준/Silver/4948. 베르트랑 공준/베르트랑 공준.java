import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while (true) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                break; // 0이 입력되면 종료
            }

            int count = 0;
            boolean[] isPrime = new boolean[2 * n + 1];

            for (int i = 2; i <= 2 * n; i++) {
                isPrime[i] = true;
            }

            for (int i = 2; i * i <= 2 * n; i++) {
                if (isPrime[i]) {
                    for (int j = i * i; j <= 2 * n; j += i) {
                        isPrime[j] = false;
                    }
                }
            }

            for (int i = n + 1; i <= 2 * n; i++) {
                if (isPrime[i]) {
                    count++;
                }
            }
            System.out.println(count);
        }
        br.close();
    }
}