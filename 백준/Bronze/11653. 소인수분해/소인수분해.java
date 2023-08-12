import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 숫자 입력
        int divisor = 2; // 소인수분해를 시작.

        while (N > 1) {
            if (N % divisor == 0) {
                System.out.println(divisor); // 소인수 출력
                N /= divisor; // 나눈 몫으로 업데이트
            } else {
                divisor++; // 소인수가 아니면 다음 수로 넘어감
            }
        }
        oh.close();
    }
}