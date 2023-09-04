import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        long min = oh.nextLong();
        long max = oh.nextLong();

        boolean[] isNotSquareFree = new boolean[(int) (max - min + 1)];

        for (long i = 2; i * i <= max; i++) {
            long start = min / (i * i) * (i * i);
            if (start < min) {
                start += i * i;
            }

            for (long j = start; j <= max; j += i * i) {
                isNotSquareFree[(int) (j - min)] = true;
            }
        }

        int count = 0;
        for (boolean squareFree : isNotSquareFree) {
            if (!squareFree) {
                count++;
            }
        }

        System.out.println(count);
    }
}