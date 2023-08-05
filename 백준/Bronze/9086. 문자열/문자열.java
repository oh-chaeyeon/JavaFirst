import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int t = oh.nextInt(); // 테스트 케이스 개수 입력
        oh.nextLine(); // 개행 문자 제거

        for (int i = 0; i < t; i++) {
            String str = oh.nextLine(); // 문자열 입력

            char first = str.charAt(0); // 첫 번째 문자
            char last = str.charAt(str.length() - 1); // 마지막 문자

            System.out.println(first + "" + last); // 결과 출력
        }

        oh.close();
    }
}