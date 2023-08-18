import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 숫자의 개수
        int[] numbers = new int[N]; // 숫자를 저장할 배열

        // 숫자 입력받기
        for (int i = 0; i < N; i++) {
            numbers[i] = oh.nextInt();
        }

        // 숫자 배열을 오름차순으로 정렬
        Arrays.sort(numbers);

        // 정렬된 숫자 출력
        for (int i = 0; i < N; i++) {
            System.out.println(numbers[i]);
        }
        oh.close();
    }
}