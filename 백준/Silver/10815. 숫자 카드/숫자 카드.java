import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine()); // 숫자 카드의 개수
        int[] cards = new int[N]; // 숫자 카드를 저장할 배열

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            cards[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(cards); // 숫자 카드 배열 정렬
        
        int M = Integer.parseInt(br.readLine()); // 검사할 숫자 카드의 개수
        st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < M; i++) {
            int target = Integer.parseInt(st.nextToken());
            int result = binarySearch(cards, target);

            sb.append(result).append(" ");
        }

        System.out.println(sb.toString());

        br.close();
    }

    // 이진 탐색 함수
    private static int binarySearch(int[] arr, int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] == target) {
                return 1; // 해당 숫자 카드가 있다면 1 반환
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return 0; // 해당 숫자 카드가 없다면 0 반환
    }
}