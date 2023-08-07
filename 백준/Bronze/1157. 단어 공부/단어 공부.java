import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String word = oh.next().toUpperCase(); // 대문자로 입력 받음

        int[] count = new int[26]; // 알파벳 개수(26) 크기의 배열 생성

        // 주어진 단어에서 각 알파벳 개수를 세기
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            int index = ch - 'A'; // 알파벳의 인덱스 계산
            count[index]++; // 해당 알파벳 개수 증가
        }

        int maxCount = 0; // 가장 많이 사용된 알파벳의 개수
        char maxChar = '?'; // 가장 많이 사용된 알파벳

        // 가장 많이 사용된 알파벳 찾기
        for (int i = 0; i < count.length; i++) {
            if (count[i] > maxCount) {
                maxCount = count[i];
                maxChar = (char) (i + 'A');
            } else if (count[i] == maxCount) {
                maxChar = '?'; // 가장 많이 사용된 알파벳이 여러 개인 경우 ? 출력
            }
        }
        System.out.println(maxChar); // 결과 출력
        oh.close();
    }
}