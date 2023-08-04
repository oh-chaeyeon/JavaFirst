import java.util.Scanner;
import java.util.HashSet;
 
public class Main {
 
	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		HashSet<Integer> H = new HashSet<Integer>();
 
		for (int i = 0; i < 10; i++) {
			H.add(oh.nextInt() % 42); //입력받은 값의 나머지 값은 HashSet에 저장
		}
        
		oh.close();
		System.out.print(H.size());
	}
}
