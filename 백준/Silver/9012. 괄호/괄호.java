import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int T = oh.nextInt(); // 테스트 케이스의 개수
        
        for (int t = 0; t < T; t++) {
            String input = oh.next();
            if (isValidParentheses(input)) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
        
        oh.close();
    }
    
    private static boolean isValidParentheses(String s) {
        Stack<Character> stack = new Stack<>();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == '(') {
                stack.push(c);
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop();
            } else {
                return false;
            }
        }
        
        return stack.isEmpty();
    }
}