import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int A = oh.nextInt(); // 세로 길이 입력
        int B = oh.nextInt(); // 가로 길이 입력

        int area = A * B; // 직사각형의 넓이 계산

        System.out.println(area); // 넓이 출력

        oh.close();
    }
}
