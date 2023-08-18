import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 숫자의 개수
        int[] numbers = new int[N]; // 숫자를 저장할 배열

        // 숫자 입력받기
        for (int i = 0; i < N; i++) {
            numbers[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(numbers); // 숫자 배열을 오름차순으로 정렬

        // 정렬된 숫자 출력
        StringBuilder sb = new StringBuilder();
        for (int num : numbers) {
            sb.append(num).append("\n");
        }

        System.out.println(sb.toString());
        br.close();
    }
}