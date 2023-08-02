import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int n = oh.nextInt(); // 배열 크기
        int X = oh.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = oh.nextInt(); // 입력받은 n만큼 정수 입력 배열 arr에 저장
        }

        for (int i = 0; i < n; i++) {
            if (X > arr[i])
                System.out.print(arr[i] + " ");
        }
    }
}
