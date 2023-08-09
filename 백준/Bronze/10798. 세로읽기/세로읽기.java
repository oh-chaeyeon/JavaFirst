import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String[] words = new String[5]; // 단어를 저장할 배열 생성

        for (int i = 0; i < 5; i++) {
            words[i] = oh.next(); // 단어 입력
        }
        int maxLength = 0; // 가장 긴 단어의 길이
        // 가장 긴 단어의 길이 구하기
        for (String word : words) {
            if (word.length() > maxLength) {
                maxLength = word.length();
            }
        }

        // 세로로 읽어서 출력
        for (int i = 0; i < maxLength; i++) {
            for (int j = 0; j < 5; j++) {
                if (i < words[j].length()) {
                    System.out.print(words[j].charAt(i));
                }
            }
        }

        oh.close();
    }
}