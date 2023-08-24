import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        
        int N = oh.nextInt();
        int k = oh.nextInt();
        
        int[] scores = new int[N];
        for (int i = 0; i < N; i++) {
            scores[i] = oh.nextInt();
        }
        
        Arrays.sort(scores);
        
        int cutLine = scores[N - k];
        System.out.println(cutLine);       
        oh.close();
    }
}