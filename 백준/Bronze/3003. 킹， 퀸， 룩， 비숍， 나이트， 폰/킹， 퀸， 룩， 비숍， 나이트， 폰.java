import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int[] chessPieces = {1, 1, 2, 2, 2, 8}; // 기물의 개수

        for (int i = 0; i < 6; i++) {
            int num = oh.nextInt(); // 주어진 기물의 개수
            int result = chessPieces[i] - num; // 필요한 기물의 개수

            System.out.print(result + " ");
        }
        oh.close();
    }
}
