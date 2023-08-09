import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 색종이의 수
        int[][] grid = new int[101][101]; // 도화지 생성 (0으로 초기화)

        for (int i = 0; i < N; i++) {
            int x = oh.nextInt();
            int y = oh.nextInt();

            for (int j = x; j < x + 10; j++) {
                for (int k = y; k < y + 10; k++) {
                    grid[j][k] = 1; // 색종이가 붙어있는 부분을 1로 표시
                }
            }
        }
        int count = 0; // 색종이가 붙은 영역의 넓이

        // 색종이가 붙어있는 부분을 세면서 넓이를 계산
        for (int i = 1; i <= 100; i++) {
            for (int j = 1; j <= 100; j++) {
                if (grid[i][j] == 1) {
                    count++;
                }
            }
        }

        System.out.println(count);
        oh.close();
    }
}