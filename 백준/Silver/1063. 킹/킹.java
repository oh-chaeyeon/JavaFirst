import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        String king = oh.next();
        String stone = oh.next();
        int n = oh.nextInt();

        int kingX = king.charAt(0) - 'A';
        int kingY = king.charAt(1) - '1';
        int stoneX = stone.charAt(0) - 'A';
        int stoneY = stone.charAt(1) - '1';

        while (n-- > 0) {
            String move = oh.next();

            int dx = 0, dy = 0;

            if (move.equals("R")) {
                dx = 1;
            } else if (move.equals("L")) {
                dx = -1;
            } else if (move.equals("B")) {
                dy = -1;
            } else if (move.equals("T")) {
                dy = 1;
            } else if (move.equals("RT")) {
                dx = 1;
                dy = 1;
            } else if (move.equals("LT")) {
                dx = -1;
                dy = 1;
            } else if (move.equals("RB")) {
                dx = 1;
                dy = -1;
            } else if (move.equals("LB")) {
                dx = -1;
                dy = -1;
            }

            int newKingX = kingX + dx;
            int newKingY = kingY + dy;

            if (isValidPosition(newKingX, newKingY)) {
                if (newKingX == stoneX && newKingY == stoneY) {
                    int newStoneX = stoneX + dx;
                    int newStoneY = stoneY + dy;
                    if (isValidPosition(newStoneX, newStoneY)) {
                        kingX = newKingX;
                        kingY = newKingY;
                        stoneX = newStoneX;
                        stoneY = newStoneY;
                    }
                } else {
                    kingX = newKingX;
                    kingY = newKingY;
                }
            }
        }

        char kingColumn = (char) ('A' + kingX);
        char kingRow = (char) ('1' + kingY);
        char stoneColumn = (char) ('A' + stoneX);
        char stoneRow = (char) ('1' + stoneY);

        System.out.println(kingColumn + "" + kingRow);
        System.out.println(stoneColumn + "" + stoneRow);
    }

    // 체스판 유효한 위치인지 확인하는 함수
    static boolean isValidPosition(int x, int y) {
        return x >= 0 && x < 8 && y >= 0 && y < 8;
    }
}