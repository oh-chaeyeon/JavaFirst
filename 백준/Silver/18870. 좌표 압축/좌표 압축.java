import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner oh = new Scanner(System.in);
        int n = oh.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = oh.nextInt();
        }

        int[] sortedArr = arr.clone();
        Arrays.sort(sortedArr);

        HashMap<Integer, Integer> coordinateMap = new HashMap<>();
        int coordinate = 0;

        for (int num : sortedArr) {
            if (!coordinateMap.containsKey(num)) {
                coordinateMap.put(num, coordinate++);
            }
        }

        StringBuilder result = new StringBuilder();

        for (int num : arr) {
            result.append(coordinateMap.get(num)).append(" ");
        }

        System.out.println(result.toString().trim());
    }
}