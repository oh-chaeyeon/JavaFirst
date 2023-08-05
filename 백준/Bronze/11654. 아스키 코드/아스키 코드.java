import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        char ch = oh.next().charAt(0); // 문자 입력
        int asciiValue = (int) ch; // 아스키 코드 값 변환

        System.out.println(asciiValue); // 결과 출력

        oh.close();
    }
}
