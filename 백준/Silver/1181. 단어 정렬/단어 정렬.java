import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 단어의 개수
        String[] words = new String[N]; // 단어를 저장할 배열

        // 단어 입력받기
        for (int i = 0; i < N; i++) {
            words[i] = oh.next();
        }

        // Comparator를 사용하여 길이가 짧은 순으로 정렬, 길이가 같다면 사전 순으로 정렬
        Arrays.sort(words, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (o1.length() == o2.length()) {
                    return o1.compareTo(o2);
                }
                return Integer.compare(o1.length(), o2.length());
            }
        });

        // 중복된 단어 제거하고 정렬된 단어 출력
        System.out.println(words[0]);
        for (int i = 1; i < N; i++) {
            if (!words[i].equals(words[i - 1])) {
                System.out.println(words[i]);
            }
        }
        oh.close();
    }
}