import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner oh = new Scanner(System.in);
        int n = oh.nextInt(); // 배열 크기
        
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = oh.nextInt(); //입력받은 n만큼 정수 입력 배열 arr에 저장
        }
        
        int v = oh.nextInt(); //찾으려고 하는 수
        int cnt  = 0; //배열 안에 있는 수 중에 찾으려고 하는 수가 나올 때마다 카운트!
        for (int i=0; i<n; i++){
            if(v == arr[i]) 
                cnt++;
        }
        System.out.println(cnt);
    }
}