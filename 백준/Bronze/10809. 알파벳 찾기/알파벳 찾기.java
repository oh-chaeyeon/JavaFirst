import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String word = oh.nextLine(); // 단어 입력
        int[] positions = new int[26]; // 알파벳 개수(26) 크기의 배열 생성

        for (int i = 0; i < positions.length; i++) {
            positions[i] = -1; // 각 알파벳의 위치를 -1로 초기화
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'a'; // 알파벳의 인덱스 계산

            // 처음 등장한 알파벳인 경우에만 위치를 기록
            if (positions[index] == -1) {
                positions[index] = i;
            }
        }

        // 결과 출력
        for (int i = 0; i < positions.length; i++) {
            System.out.print(positions[i] + " ");
        }
        oh.close();
    }
}
