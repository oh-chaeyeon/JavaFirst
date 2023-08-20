import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]); // 문자열 집합의 크기
        int M = Integer.parseInt(input[1]); // 검사할 문자열 개수

        HashSet<String> set = new HashSet<>(); // 문자열 집합을 저장할 해시셋

        for (int i = 0; i < N; i++) {
            set.add(br.readLine()); // 문자열 집합에 문자열 추가
        }

        int count = 0; // 검사한 문자열 중 문자열 집합에 포함된 개수

        for (int i = 0; i < M; i++) {
            String query = br.readLine();
            if (set.contains(query)) {
                count++;
            }
        }

        System.out.println(count);
        br.close();
    }
}