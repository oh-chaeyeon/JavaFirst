import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt();
        int M = oh.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i+1;
        }

        for (int i = 0; i < M; i++) {
            int tmp;
            int F = oh.nextInt();
            int E = oh.nextInt();

            tmp = arr[F-1];
            arr[F-1] = arr[E-1];
            arr[E-1] = tmp;
        }
        oh.close();

        for (int baguni : arr)
            System.out.print(baguni + " ");
    }
}