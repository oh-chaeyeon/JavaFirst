import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        while (true) {
            int[] sides = new int[3]; // 세 변의 길이 배열
            for (int i = 0; i < 3; i++) {
                sides[i] = oh.nextInt();
            }

            if (sides[0] == 0 && sides[1] == 0 && sides[2] == 0) {
                break; // 종료 조건
            }

            Arrays.sort(sides); // 세 변의 길이를 오름차순으로 정렬

            if (sides[0] + sides[1] <= sides[2]) {
                System.out.println("Invalid");
            } else if (sides[0] == sides[2]) {
                System.out.println("Equilateral");
            } else if (sides[0] == sides[1] || sides[1] == sides[2]) {
                System.out.println("Isosceles");
            } else {
                System.out.println("Scalene");
            }
        }

        oh.close();
    }
}