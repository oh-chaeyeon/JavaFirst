import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int t = oh.nextInt(); // 테스트 개수 입력

        for (int i = 0; i < t; i++) {
            int r = oh.nextInt(); // 반복 횟수 입력
            String word = oh.next(); // 문자열 입력

            for (int j = 0; j < word.length(); j++) {
                char ch = word.charAt(j);
                for (int k = 0; k < r; k++) {
                    System.out.print(ch); // 문자를 r번 반복해서 출력
                }
            }
            System.out.println(); // 각 테스트 케이스마다
        }
        oh.close();
    }
}