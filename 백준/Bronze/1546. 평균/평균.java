import java.util.Arrays;
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
 
		Scanner oh = new Scanner(System.in); 
		double arr[] = new double[oh.nextInt()];
		
        //배열에 모든 원소를 입력받아 저장
		for(int i = 0; i < arr.length; i++) {
			arr[i] = oh.nextDouble();
		}
		oh.close();
		
		double sum = 0;
		Arrays.sort(arr); //오름차순으로 정렬--> 최댓값의 위치가 배열의 마지막.
		
		for(int i = 0; i < arr.length; i++) {
			sum += ((arr[i] / arr[arr.length-1]) * 100);
		}
		System.out.print(sum / arr.length);
	}
}