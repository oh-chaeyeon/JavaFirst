import java.util.Arrays;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String numStr = oh.next(); // 숫자를 문자열로 입력받음
        char[] numArr = numStr.toCharArray(); // 문자열을 문자 배열로 변환

        // 문자 배열을 오름차순으로 정렬
        Arrays.sort(numArr);

        // 문자 배열을 역순으로 출력하여 내림차순으로
        StringBuilder result = new StringBuilder();
        for (int i = numArr.length - 1; i >= 0; i--) {
            result.append(numArr[i]);
        }

        System.out.println(result.toString());
        oh.close();
    }
}