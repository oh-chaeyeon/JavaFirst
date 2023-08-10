import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int X = oh.nextInt(); // 찾을 분수의 순서
        int line = 1; // 몇 번째 대각선 라인에 있는지

        // 해당 대각선 라인의 첫 분자와 분모
        int numerator = 1;
        int denominator = 1;

        while (X > line) {
            X -= line; // 현재 라인의 분수들을 제외한 나머지 분수의 개수
            line++; // 다음 대각선 라인으로 이동
        }

        if (line % 2 == 0) { // 짝수번째 대각선 라인일 때
            numerator = X; // 분자는 X
            denominator = line - X + 1; // 분모는 line - X + 1
        } 
        else { // 홀수번째 대각선 라인일 때
            numerator = line - X + 1; // 분자는 line - X + 1
            denominator = X; // 분모는 X
        }

        System.out.println(numerator + "/" + denominator);
        oh.close();
    }
}