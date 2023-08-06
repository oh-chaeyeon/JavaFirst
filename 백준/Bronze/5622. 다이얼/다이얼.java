import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String input = oh.next(); // 문자열 입력

        int time = 0;
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            // 각 알파벳에 해당하는 다이얼 시간 계산
            if ('A' <= ch && ch <= 'C') {
                time += 3;
            } else if ('D' <= ch && ch <= 'F') {
                time += 4;
            } else if ('G' <= ch && ch <= 'I') {
                time += 5;
            } else if ('J' <= ch && ch <= 'L') {
                time += 6;
            } else if ('M' <= ch && ch <= 'O') {
                time += 7;
            } else if ('P' <= ch && ch <= 'S') {
                time += 8;
            } else if ('T' <= ch && ch <= 'V') {
                time += 9;
            } else if ('W' <= ch && ch <= 'Z') {
                time += 10;
            }
        }

        System.out.println(time); 
        oh.close();
    }
}
