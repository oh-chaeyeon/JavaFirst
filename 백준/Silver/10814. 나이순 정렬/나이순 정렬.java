import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Member {
    int age;
    String name;
    
    public Member(int age, String name) {
        this.age = age;
        this.name = name;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);

        int N = oh.nextInt(); // 회원의 수
        Member[] members = new Member[N]; // 회원 정보를 저장할 배열

        // 회원 정보 입력받기
        for (int i = 0; i < N; i++) {
            int age = oh.nextInt(); // 나이
            String name = oh.next(); // 이름
            members[i] = new Member(age, name);
        }

        // Comparator를 사용하여 나이순으로 정렬, 나이가 같다면 가입 순으로 정렬
        Arrays.sort(members, new Comparator<Member>() {
            @Override
            public int compare(Member o1, Member o2) {
                return Integer.compare(o1.age, o2.age);
            }
        });

        // 정렬된 회원 정보 출력
        for (int i = 0; i < N; i++) {
            System.out.println(members[i].age + " " + members[i].name);
        }

        oh.close();
    }
}