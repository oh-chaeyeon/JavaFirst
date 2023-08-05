import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner oh = new Scanner(System.in);
		
		String st = oh.next();
		int num = oh.nextInt()-1;
		
		System.out.println(st.charAt(num)); //문자열-1은 0번째부터 시작하기 때문
		
		oh.close();
	}
}