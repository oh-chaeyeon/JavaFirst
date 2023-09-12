import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt(); // 큐의 크기
        int M = oh.nextInt(); // 뽑아내려는 수의 개수
        Deque<Integer> queue = new LinkedList<>();

        for (int i = 1; i <= N; i++) {
            queue.add(i);
        }

        int count = 0;

        for (int i = 0; i < M; i++) {
            int target = oh.nextInt();

            while (true) {
                int front = queue.getFirst();
                int index = 0;

                for (Integer num : queue) {
                    if (num == target) {
                        break;
                    }
                    index++;
                }

                if (index == 0) {
                    queue.pollFirst();
                    break;
                } else if (index <= queue.size() / 2) {
                    queue.addLast(front);
                    queue.pollFirst();
                    count++;
                } else {
                    queue.addFirst(queue.pollLast());
                    count++;
                }
            }
        }

        System.out.println(count);
    }
}