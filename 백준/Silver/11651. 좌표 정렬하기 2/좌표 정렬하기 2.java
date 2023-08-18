import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 좌표의 개수
        int[][] coordinates = new int[N][2]; // 좌표를 저장할 배열

        // 좌표 입력받기
        for (int i = 0; i < N; i++) {
            coordinates[i][0] = oh.nextInt(); // x좌표
            coordinates[i][1] = oh.nextInt(); // y좌표
        }

        // Comparator를 사용하여 y좌표를 기준으로 오름차순, y좌표가 같다면 x좌표를 기준으로 오름차순 정렬
        Arrays.sort(coordinates, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                if (o1[1] == o2[1]) {
                    return Integer.compare(o1[0], o2[0]);
                }
                return Integer.compare(o1[1], o2[1]);
            }
        });

        // 정렬된 좌표 출력
        for (int i = 0; i < N; i++) {
            System.out.println(coordinates[i][0] + " " + coordinates[i][1]);
        }
        oh.close();
    }
}