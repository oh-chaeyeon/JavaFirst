import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt(); // 테스트 케이스 수
        oh.nextLine(); // 개행 문자 처리

        while (N-- > 0) {
            String input = oh.nextLine();

            // 정규표현식 패턴
            Pattern pattern = Pattern.compile("(100+1+|01)+");
            Matcher matcher = pattern.matcher(input);

            if (matcher.matches()) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}