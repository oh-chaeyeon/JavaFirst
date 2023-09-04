import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt();
        int[] divisors = new int[N];

        for (int i = 0; i < N; i++) {
            divisors[i] = oh.nextInt();
        }

        Arrays.sort(divisors); // 약수를 오름차순 정렬

        long smallestInteger = (long) divisors[0] * divisors[N - 1]; // 가장 작은 정수는 가장 작은 약수와 가장 큰 약수의 곱

        System.out.println(smallestInteger);
    }
}