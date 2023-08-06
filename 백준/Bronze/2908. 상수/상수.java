import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int num1 = oh.nextInt(); // 첫 번째 세자리 수 입력
        int num2 = oh.nextInt(); // 두 번째 세자리 수 입력

        //reverseNumber 메소드는 주어진 세 자리 수를 거꾸로 뒤집는 역할.
        int reversedNum1 = reverseNumber(num1); // 첫 번째 수를 거꾸로 뒤집음
        int reversedNum2 = reverseNumber(num2); // 두 번째 수를 거꾸로 뒤집음

        //Math.max 메소드를 사용하여 두 수 중 더 큰 값을 선택한 후, 출력
        int maxReversedNum = Math.max(reversedNum1, reversedNum2); 
        System.out.println(maxReversedNum); 

        oh.close();
    }

    // 세 자리 수를 거꾸로 뒤집는 메소드
    public static int reverseNumber(int num) {
        int reversed = 0;
        while (num > 0) {
            int remainder = num % 10;
            reversed = reversed * 10 + remainder;
            num /= 10;
        }
        return reversed;
    }
}
