import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt(); // 원하는 합
        int L = oh.nextInt(); // 연속된 자연수의 개수

        for (int len = L; len <= 100; len++) {
            int start = (2 * N - len * (len - 1)) / (2 * len);
            
            if (start < 0)
                break;

            if (2 * N == len * (2 * start + len - 1)) {
                for (int i = 0; i < len; i++) {
                    System.out.print(start + i + " ");
                }
                return;
            }
        }

        System.out.println("-1");
    }
}