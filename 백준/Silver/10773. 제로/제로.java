import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int K = oh.nextInt(); // 입력의 개수
        
        Stack<Integer> stack = new Stack<>();
        
        for (int i = 0; i < K; i++) {
            int num = oh.nextInt();
            
            if (num == 0) {
                stack.pop();
            } else {
                stack.push(num);
            }
        }
        
        int sum = 0;
        while (!stack.isEmpty()) {
            sum += stack.pop();
        }
        
        System.out.println(sum);
        
        oh.close();
    }
}