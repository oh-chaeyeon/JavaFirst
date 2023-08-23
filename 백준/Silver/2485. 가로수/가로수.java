import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        
        int[] trees = new int[N];
        for (int i = 0; i < N; i++) {
            trees[i] = Integer.parseInt(br.readLine());
        }
        
        int[] intervals = new int[N - 1];
        for (int i = 0; i < N - 1; i++) {
            intervals[i] = trees[i + 1] - trees[i];
        }
        
        int gcd = intervals[0];
        for (int i = 1; i < N - 1; i++) {
            gcd = findGCD(gcd, intervals[i]);
        }
        
        int additionalTrees = 0;
        for (int i = 0; i < N - 1; i++) {
            additionalTrees += (intervals[i] / gcd) - 1;
        }
        
        System.out.println(additionalTrees);
        br.close();
    }
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}