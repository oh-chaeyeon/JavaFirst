import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        HashMap<String, Integer> colors = new HashMap<>();
        colors.put("black", 0);
        colors.put("brown", 1);
        colors.put("red", 2);
        colors.put("orange", 3);
        colors.put("yellow", 4);
        colors.put("green", 5);
        colors.put("blue", 6);
        colors.put("violet", 7);
        colors.put("grey", 8);
        colors.put("white", 9);

        String color1 = br.readLine();
        String color2 = br.readLine();
        String color3 = br.readLine();

        long resistanceValue = (long) (colors.get(color1) * 10 + colors.get(color2)) * (long) Math.pow(10, colors.get(color3));
        System.out.println(resistanceValue);
        br.close();
    }
}