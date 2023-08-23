import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int num1Numerator = Integer.parseInt(st1.nextToken());
        int num1Denominator = Integer.parseInt(st1.nextToken());
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int num2Numerator = Integer.parseInt(st2.nextToken());
        int num2Denominator = Integer.parseInt(st2.nextToken());
        
        int lcm = (num1Denominator * num2Denominator) / findGCD(num1Denominator, num2Denominator); // 최소공배수 계산
        
        // 분자를 합하여 기약분수 형태로 출력
        int numerator = (num1Numerator * (lcm / num1Denominator)) + (num2Numerator * (lcm / num2Denominator));
        
        int gcd = findGCD(numerator, lcm); // 분자와 최소공배수의 최대공약수 계산
        numerator /= gcd;
        lcm /= gcd;
        
        System.out.println(numerator + " " + lcm);
        
        br.close();
    }

    // 최대공약수를 구하는 함수
    private static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}