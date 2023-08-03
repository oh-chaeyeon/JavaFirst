import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt();
        int[] arr = new int[N];
        int M = oh.nextInt();

        for(int i = 0; i < M; i++) {
            int I = oh.nextInt();
            int J = oh.nextInt();
            int K = oh.nextInt();

            for(int j = I - 1; j < J; j++) {
                arr[j] = K;
            }
        }
        for(int k = 0; k < arr.length; k++) {
            System.out.print(arr[k] + " ");
        }
    }
}