import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int[] xPoints = new int[3]; // 세 점의 x 좌표 배열
        int[] yPoints = new int[3]; // 세 점의 y 좌표 배열

        // 세 점의 좌표 입력 받기
        for (int i = 0; i < 3; i++) {
            xPoints[i] = oh.nextInt();
            yPoints[i] = oh.nextInt();
        }

        // 나머지 한 점의 좌표를 계산하여 출력
        int x4 = findFourthCoordinate(xPoints);
        int y4 = findFourthCoordinate(yPoints);
        System.out.println(x4 + " " + y4);

        oh.close();
    }

    // 나머지 한 점의 좌표를 계산하는 함수
    private static int findFourthCoordinate(int[] points) {
        if (points[0] == points[1]) {
            return points[2];
        } else if (points[0] == points[2]) {
            return points[1];
        } else {
            return points[0];
        }
    }
}