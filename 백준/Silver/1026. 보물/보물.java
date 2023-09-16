import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader oh = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(oh.readLine());
        int[] A = new int[N];
        int[] B = new int[N];

        StringTokenizer stA = new StringTokenizer(oh.readLine());
        StringTokenizer stB = new StringTokenizer(oh.readLine());

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(stA.nextToken());
        }

        for (int i = 0; i < N; i++) {
            B[i] = Integer.parseInt(stB.nextToken());
        }

        // 배열 A는 오름차순 정렬
        Arrays.sort(A);

        // 배열 B는 내림차순 정렬
        Arrays.sort(B);
        reverse(B);

        int result = 0;

        for (int i = 0; i < N; i++) {
            result += A[i] * B[i];
        }

        System.out.println(result);
    }

    // 배열을 뒤집는 함수
    static void reverse(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            start++;
            end--;
        }
    }
}