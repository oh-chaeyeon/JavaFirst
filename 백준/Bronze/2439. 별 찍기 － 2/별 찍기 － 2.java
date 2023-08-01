import java.util.Scanner;
public class Main {
	public static void main(String args[]) {
 
		Scanner oh = new Scanner(System.in);
		int num = oh.nextInt();
        
		for(int i=1;i<num+1;i++){
	        for(int j=num;j>0;j--){
		        if(i<j){
			        System.out.print(" ");
		        }else{
			        System.out.print("*");
		        }
	        }
	        System.out.println("");
        }
		oh.close();
	}
}