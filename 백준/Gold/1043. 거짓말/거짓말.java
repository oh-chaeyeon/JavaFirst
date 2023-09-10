import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int N = oh.nextInt(); // 사람의 수
        int M = oh.nextInt(); // 파티의 수

        int[] truth = new int[N + 1]; // 진실을 아는 사람을 표시하는 배열
        int count = 0;

        int T = oh.nextInt(); // 진실을 아는 사람의 수
        List<Integer> truthPeople = new ArrayList<>();

        for (int i = 0; i < T; i++) {
            int person = oh.nextInt();
            truthPeople.add(person);
            truth[person] = 1;
        }

        List<List<Integer>> parties = new ArrayList<>();

        for (int i = 0; i < M; i++) {
            List<Integer> party = new ArrayList<>();
            int k = oh.nextInt();
            for (int j = 0; j < k; j++) {
                int person = oh.nextInt();
                party.add(person);
            }
            parties.add(party);
        }

        boolean changed = true;

        while (changed) {
            changed = false;

            for (int i = 0; i < M; i++) {
                List<Integer> party = parties.get(i);
                for (int person : party) {
                    if (truth[person] == 1) {
                        for (int p : party) {
                            if (truth[p] == 0) {
                                truth[p] = 1;
                                truthPeople.add(p);
                                changed = true;
                            }
                        }
                        break;
                    }
                }
            }
        }

        for (int i = 0; i < M; i++) {
            List<Integer> party = parties.get(i);
            boolean knowsTruth = false;

            for (int person : party) {
                if (truth[person] == 1) {
                    knowsTruth = true;
                    break;
                }
            }

            if (!knowsTruth) {
                count++;
            }
        }

        System.out.println(count);
    }
}