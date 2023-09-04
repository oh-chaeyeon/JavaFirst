import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt();
        String[] fileNames = new String[N];

        // 파일명 입력
        for (int i = 0; i < N; i++) {
            fileNames[i] = oh.next();
        }

        // 첫 번째 파일명을 기준으로 비교
        StringBuilder commonPart = new StringBuilder(fileNames[0]);

        for (int i = 0; i < commonPart.length(); i++) {
            char currentChar = commonPart.charAt(i);

            for (int j = 1; j < N; j++) {
                // 다른 파일명과 비교하며 일치하지 않는 문자를 만나면 ?로 대체
                if (fileNames[j].charAt(i) != currentChar) {
                    commonPart.setCharAt(i, '?');
                    break;
                }
            }
        }

        System.out.println(commonPart.toString());
    }
}