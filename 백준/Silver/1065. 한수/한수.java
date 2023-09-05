import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int n = oh.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            if (isHansu(i)) {
                count++;
            }
        }

        System.out.println(count);
    }

    // 한수 여부를 판단하는 함수
    static boolean isHansu(int num) {
        if (num < 100) {
            return true;
        } else {
            int hundreds = num / 100;
            int tens = (num / 10) % 10;
            int ones = num % 10;

            return (hundreds - tens) == (tens - ones);
        }
    }
}