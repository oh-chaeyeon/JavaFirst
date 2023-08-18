import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 숫자의 개수
        int[] counts = new int[10001]; // 숫자의 개수를 저장할 배열

        // 숫자 개수 세기
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(br.readLine());
            counts[num]++;
        }

        // 정렬된 숫자 출력
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= 10000; i++) {
            while (counts[i] > 0) {
                sb.append(i).append("\n");
                counts[i]--;
            }
        }

        System.out.println(sb.toString());
        br.close();
    }
}