import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int n = oh.nextInt(); // 숫자 개수 입력
        oh.nextLine(); // 개행 문자 제거

        String numbers = oh.nextLine(); // 숫자들을 문자열로 입력 받음

        int sum = 0;
        for (int i = 0; i < n; i++) {
            int num = Character.getNumericValue(numbers.charAt(i)); // 문자를 숫자로 변환
            sum += num; // 숫자를 더해줌
        }

        System.out.println(sum); // 결과 출력

        oh.close();
    }
}
