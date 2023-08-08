import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        String input = oh.next(); // 문자열 입력

        String[] croatian = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};

        for (String croa : croatian) {
            input = input.replace(croa, "A"); // 크로아티아 알파벳을 A로 대체
        }

        System.out.println(input.length()); // 결과 출력

        oh.close();
    }
}