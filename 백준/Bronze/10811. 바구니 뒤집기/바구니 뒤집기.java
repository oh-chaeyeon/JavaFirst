import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt();
        int M = oh.nextInt();

        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = i + 1; // 배열은 0부터 시작함--> arr[0]에 1을 넣기 위해서는 1을 더해줘야함.
        }

        for (int i = 0; i < M; i++) { // M개의 줄
            int left = oh.nextInt() - 1; // 배열 0부터 시작
            int right = oh.nextInt() - 1;

            while (left < right) {
                int temp = arr[left];
                arr[left++] = arr[right];
                arr[right--] = temp;
            }
        }
        oh.close();

        for (int baguni:arr)
            System.out.print(baguni + " ");
    }
}