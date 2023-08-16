import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int angle1 = oh.nextInt(); // 첫 번째 각도 입력
        int angle2 = oh.nextInt(); // 두 번째 각도 입력
        int angle3 = oh.nextInt(); // 세 번째 각도 입력

        if (angle1 + angle2 + angle3 != 180) {
            System.out.println("Error");
        } else if (angle1 == angle2 && angle2 == angle3) {
            System.out.println("Equilateral");
        } else if (angle1 == angle2 || angle2 == angle3 || angle1 == angle3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

        oh.close();
    }
}