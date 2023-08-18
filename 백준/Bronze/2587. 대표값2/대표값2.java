import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int[] numbers = new int[5]; // 5개의 정수를 저장할 배열

        // 정수 입력받기
        for (int i = 0; i < 5; i++) {
            numbers[i] = oh.nextInt();
        }

        Arrays.sort(numbers); // 정수 배열을 오름차순으로 정렬

        int sum = 0;
        for (int num : numbers) {
            sum += num;
        }

        int average = sum / 5; // 평균값
        int median = numbers[2]; // 중간값

        System.out.println(average);
        System.out.println(median);

        oh.close();
    }
}