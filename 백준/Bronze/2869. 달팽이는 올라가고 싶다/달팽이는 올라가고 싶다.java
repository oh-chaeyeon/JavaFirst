import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int A = oh.nextInt(); // 달팽이가 낮에 올라가는 미터 수
        int B = oh.nextInt(); // 달팽이가 밤에 미끄러지는 미터 수
        int V = oh.nextInt(); // 나무의 높이

        // (V - A)를 (A - B)로 나누어서 올라가는 일 수를 계산
        int days = (V - A) / (A - B);

        // 나머지가 있다면 하루 더 걸림
        if ((V - A) % (A - B) != 0) {
            days++;
        }

        // 시작하는 날을 포함해서 출력
        System.out.println(days + 1);

        oh.close();
    }
}