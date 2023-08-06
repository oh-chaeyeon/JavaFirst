import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        
        while (oh.hasNextLine()) { // hasNextLine() 메소드를 사용하여 입력이 더 이상 없을 때까지 반복문을 실행
            String line = oh.nextLine(); //nextLine() 메소드를 사용하여 입력 내용을 한 줄씩 읽어서 출력
            System.out.println(line);
        }

        oh.close();
    }
}