import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String N = oh.next(); // 주어진 수
        int B = oh.nextInt(); // 진법
        int result = 0; // 변환된 결과

        for (int i = 0; i < N.length(); i++) {
            char ch = N.charAt(i);
            int digit;

            if (ch >= '0' && ch <= '9') {
                digit = ch - '0'; // 숫자인 경우
            } 
            else {
                digit = ch - 'A' + 10; // 알파벳인 경우
            }

            result = result * B + digit;
        }

        System.out.println(result);
        oh.close();
    }
}