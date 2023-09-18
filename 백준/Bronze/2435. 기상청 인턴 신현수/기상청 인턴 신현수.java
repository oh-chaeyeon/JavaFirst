import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        int[] temperatures = new int[N];

        for (int i = 0; i < N; i++) {
            temperatures[i] = Integer.parseInt(st.nextToken());
        }

        int maxDifference = Integer.MIN_VALUE;
        int sum = 0;

        for (int i = 0; i < K; i++) {
            sum += temperatures[i];
        }

        maxDifference = Math.max(maxDifference, sum);

        for (int i = K; i < N; i++) {
            sum += temperatures[i] - temperatures[i - K];
            maxDifference = Math.max(maxDifference, sum);
        }

        System.out.println(maxDifference);
    }
}