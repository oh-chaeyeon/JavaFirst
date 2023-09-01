import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스 수

        for (int t = 0; t < T; t++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st.nextToken()); // 출발점 x 좌표
            int y1 = Integer.parseInt(st.nextToken()); // 출발점 y 좌표
            int x2 = Integer.parseInt(st.nextToken()); // 도착점 x 좌표
            int y2 = Integer.parseInt(st.nextToken()); // 도착점 y 좌표

            int n = Integer.parseInt(br.readLine()); // 원의 개수
            int count = 0; // 원을 통과한 횟수

            for (int i = 0; i < n; i++) {
                st = new StringTokenizer(br.readLine());
                int cx = Integer.parseInt(st.nextToken()); // 원의 중심 x 좌표
                int cy = Integer.parseInt(st.nextToken()); // 원의 중심 y 좌표
                int r = Integer.parseInt(st.nextToken()); // 원의 반지름

                // 출발점과 도착점이 원의 내부에 동시에 있는 경우는 제외
                if (isInside(x1, y1, cx, cy, r) && isInside(x2, y2, cx, cy, r)) {
                    continue;
                }
                // 출발점 또는 도착점 중 하나만 원의 내부에 있는 경우
                if (isInside(x1, y1, cx, cy, r) || isInside(x2, y2, cx, cy, r)) {
                    count++;
                }
            }

            System.out.println(count);
        }

        br.close();
    }

    // 점 (x, y)가 원의 내부에 있는지 판단하는 함수
    private static boolean isInside(int x, int y, int cx, int cy, int r) {
        return (x - cx) * (x - cx) + (y - cy) * (y - cy) < r * r;
    }
}