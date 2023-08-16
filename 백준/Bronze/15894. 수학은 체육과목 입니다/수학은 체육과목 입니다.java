import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        long n = oh.nextLong(); // 정사각형의 변의 길이 입력

        // 정사각형의 넓이를 구하고 출력
        long area = n * 4;
        System.out.println(area);

        oh.close();
    }
}