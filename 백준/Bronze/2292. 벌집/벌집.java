import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 입력받은 방 번호

        int ring = 1; // 시작하는 중앙 방을 포함한 첫 번째 반지름
        int roomNumber = 1; // 현재 방 번호
        int roomsInRing = 6; // 한 반지름마다 있는 방의 개수

        while (N > roomNumber) {
            roomNumber += roomsInRing; // 현재 방 번호에 한 반지름의 방 개수를 더함
            ring++; // 다음 반지름으로 이동
            roomsInRing += 6; // 다음 반지름에 있는 방 개수를 6씩 증가
        }

        System.out.println(ring);
        oh.close();
    }
}