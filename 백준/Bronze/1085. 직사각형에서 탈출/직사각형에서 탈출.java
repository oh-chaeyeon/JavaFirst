import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int x = oh.nextInt(); // 현재 x 좌표
        int y = oh.nextInt(); // 현재 y 좌표
        int w = oh.nextInt(); // 직사각형의 가로 길이
        int h = oh.nextInt(); // 직사각형의 세로 길이

        // 각 변까지의 거리 중 최소값을 구함
        int minX = Math.min(x, w - x);
        int minY = Math.min(y, h - y);

        // 최소값을 출력
        System.out.println(Math.min(minX, minY));

        oh.close();
    }
}