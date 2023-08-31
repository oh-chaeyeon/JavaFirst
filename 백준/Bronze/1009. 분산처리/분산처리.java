import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner oh = new Scanner(System.in);
		int T = oh.nextInt();
		int a,b,r;
		for(int j=0;j<T;j++) {
			a=oh.nextInt();
			b=oh.nextInt();
			r=1;
			
			for (int i=0;i<b;i++) r=(r*a)%10;
			if(r==0) r=10;
			System.out.println(r);
		}
		oh.close();
	}
}