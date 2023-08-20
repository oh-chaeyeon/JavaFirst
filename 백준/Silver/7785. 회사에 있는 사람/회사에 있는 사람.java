import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()); // 로그의 개수
        Set<String> employees = new HashSet<>(); // 사람들을 저장할 집합

        for (int i = 0; i < N; i++) {
            String[] log = br.readLine().split(" ");
            String name = log[0];
            String status = log[1];

            if (status.equals("enter")) {
                employees.add(name); // 입장한 사람을 집합에 추가
            } else {
                employees.remove(name); // 퇴장한 사람을 집합에서 제거
            }
        }

        ArrayList<String> sortedEmployees = new ArrayList<>(employees); // 사람들을 정렬하기 위해 리스트로 변환
        Collections.sort(sortedEmployees, Collections.reverseOrder()); // 역순으로 정렬

        for (String name : sortedEmployees) {
            System.out.println(name);
        }
        br.close();
    }
}