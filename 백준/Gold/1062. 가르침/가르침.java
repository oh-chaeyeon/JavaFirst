import java.util.Scanner;

public class Main {
    static int N, K;
    static boolean[] learned = new boolean[26]; // 알파벳 학습 여부
    static String[] words;

    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        N = oh.nextInt(); // 단어 개수
        K = oh.nextInt(); // K개의 글자를 가르침

        if (K < 5) {
            System.out.println(0); // anta, tica를 읽기 위한 최소 글자 개수는 5개
            return;
        } else if (K == 26) {
            System.out.println(N); // 모든 알파벳을 가르칠 수 있는 경우
            return;
        }

        words = new String[N];
        for (int i = 0; i < N; i++) {
            words[i] = oh.next();
        }

        // anta, tica를 읽기 위한 학습
        learned['a' - 'a'] = true;
        learned['n' - 'a'] = true;
        learned['t' - 'a'] = true;
        learned['i' - 'a'] = true;
        learned['c' - 'a'] = true;

        int answer = dfs(0, 0);
        System.out.println(answer);
    }

    static int dfs(int idx, int cnt) {
        if (cnt == K - 5) {
            return countReadableWords();
        }

        int maxCount = 0;
        for (int i = idx; i < 26; i++) {
            if (!learned[i]) {
                learned[i] = true;
                maxCount = Math.max(maxCount, dfs(i, cnt + 1));
                learned[i] = false;
            }
        }

        return maxCount;
    }

    static int countReadableWords() {
        int count = 0;
        for (String word : words) {
            boolean isReadable = true;
            for (char c : word.toCharArray()) {
                if (!learned[c - 'a']) {
                    isReadable = false;
                    break;
                }
            }
            if (isReadable) {
                count++;
            }
        }
        return count;
    }
}