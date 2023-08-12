import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 주어진 수
        int K = oh.nextInt(); // K번째로 작은 약수를 찾기 위한 순서

        int count = 0; // 현재까지 찾은 약수의 개수
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                count++;

                if (count == K) {
                    System.out.println(i); // K번째 약수 출력
                    break;
                }
            }
        }
        if (count < K) {
            System.out.println(0); // K번째 약수가 없는 경우
        }
        oh.close();
    }
}