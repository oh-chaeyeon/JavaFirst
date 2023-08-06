import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String input = oh.nextLine(); // 문자열 입력

        // 입력된 문자열을 공백 기준으로 분리하여 단어 개수 계산
        String[] words = input.trim().split("\\s+");
        
        //trim() 메소드를 사용하여 문자열 앞뒤의 공백을 제거
        // split("\\s+") 메소드를 사용하여 문자열을 공백 기준으로 분리하여 배열 words에 저장
        int wordCount = words.length;

        // 입력된 문자열이 공백으로만 이루어진 경우 단어 개수를 0으로 수정
        if (wordCount == 1 && words[0].equals("")) {
            wordCount = 0;
        }
        System.out.println(wordCount); // 결과 출력
        oh.close();
    }
}
