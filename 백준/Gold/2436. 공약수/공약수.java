import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int gcd = Integer.parseInt(st.nextToken());
        int lcm = Integer.parseInt(st.nextToken());

        int ab = lcm / gcd; // A * B = 최소공배수 * 최대공약수

        int a = 1;
        int b = ab;
        int minDiff = ab - 1;

        for (int i = 2; i * i <= ab; i++) {
            if (ab % i == 0) {
                int tempA = i;
                int tempB = ab / i;
                if (gcd(tempA, tempB) == 1) {
                    if (tempA + tempB < a + b) {
                        a = tempA;
                        b = tempB;
                    }
                }
            }
        }

        System.out.println(a * gcd + " " + b * gcd);
    }

    // 최대공약수를 계산하는 함수
    public static int gcd(int a, int b) {
        while (b != 0) {
            int temp = a % b;
            a = b;
            b = temp;
        }
        return a;
    }
}