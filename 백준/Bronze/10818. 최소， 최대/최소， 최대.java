import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int n = oh.nextInt(); // 배열 크기
       
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = oh.nextInt(); // 입력받은 n만큼 정수 입력 배열 arr에 저장
        }

        Arrays.sort(arr); //배열에 저장된 값을 오름차순으로 정렬해주는 메소드
		System.out.print(arr[0] + " " + arr[n - 1]);
    }
}
