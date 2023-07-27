import java.util.Scanner;
public class Main {
 
	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		
        int x = oh.nextInt();
		int y = oh.nextInt();
		oh.close();
        
        if (x >= 0) {
            int totalMinutes = x * 60 + y; 
            // 입력된 시간을 분으로 환산하여 계산
            int alarmMinutes = (totalMinutes - 45 + 1440) % 1440; 
            // 음수 방지를 위해 1440으로 나눈 나머지를 사용

            int alarmHour = alarmMinutes / 60; // 알람 시간
            int alarmMinute = alarmMinutes % 60; // 알람 분

            System.out.println(alarmHour + " " + alarmMinute);
        }
	    
    }
} 