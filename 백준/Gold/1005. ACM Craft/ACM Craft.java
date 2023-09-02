import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int T = oh.nextInt();

        while (T-- > 0) {
            int N = oh.nextInt(); // 건물의 개수
            int K = oh.nextInt(); // 건물 종류의 규칙 개수
            int[] time = new int[N + 1]; // 각 건물을 짓는데 걸리는 시간
            int[] inDegree = new int[N + 1]; // 진입 차수
            ArrayList<Integer>[] graph = new ArrayList[N + 1]; // 의존 관계 그래프
            int[] result = new int[N + 1]; // 각 건물을 짓는데 필요한 최소 시간

            for (int i = 1; i <= N; i++) {
                time[i] = oh.nextInt();
                graph[i] = new ArrayList<>();
            }

            for (int i = 0; i < K; i++) {
                int X = oh.nextInt();
                int Y = oh.nextInt();
                graph[X].add(Y);
                inDegree[Y]++;
            }

            int target = oh.nextInt(); // 목표로 하는 건물 번호
            Queue<Integer> queue = new LinkedList<>();

            // 초기 진입 차수가 0인 건물을 큐에 추가
            for (int i = 1; i <= N; i++) {
                if (inDegree[i] == 0) {
                    queue.offer(i);
                    result[i] = time[i];
                }
            }

            while (!queue.isEmpty()) {
                int current = queue.poll();

                for (int next : graph[current]) {
                    if (--inDegree[next] == 0) {
                        queue.offer(next);
                    }
                    result[next] = Math.max(result[next], result[current] + time[next]);
                }
            }

            System.out.println(result[target]);
        }
    }
}