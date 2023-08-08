import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 단어의 개수 입력
        int count = 0; // 그룹 단어 개수 초기화

        for (int i = 0; i < N; i++) {
            String word = oh.next(); // 단어 입력
            boolean[] visited = new boolean[26]; // 알파벳 개수(26) 크기의 배열 생성
            boolean isGroupWord = true; // 그룹 단어 여부 초기화

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                if (visited[ch - 'a']) { // 이미 방문한 문자인 경우
                    if (word.charAt(j - 1) != ch) { // 바로 앞 문자와 다른 경우 그룹 단어가 아님
                        isGroupWord = false;
                        break;
                    }
                } else { // 처음 방문한 문자인 경우
                    visited[ch - 'a'] = true; // 해당 문자 방문 표시
                }
            }

            if (isGroupWord) {
                count++; // 그룹 단어 개수 증가
            }
        }
        System.out.println(count); // 결과 출력
        oh.close();
    }
}