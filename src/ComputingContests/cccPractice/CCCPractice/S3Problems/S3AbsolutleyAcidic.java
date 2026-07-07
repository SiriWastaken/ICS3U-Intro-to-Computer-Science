import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class S3AbsolutleyAcidic {
    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(input.readLine());
        HashMap<Integer, Integer> acidityLevels = new HashMap<>();

        for (int i = 0; i < n; i++) {
            int x = Integer.parseInt(input.readLine());
            acidityLevels.put(x, acidityLevels.getOrDefault(x, 0) + 1);
        }

        int mostFrequent = 0;
        for (int v : acidityLevels.values()) {
            if (v > mostFrequent) {
                mostFrequent = v;
            }
        }

        int minTop = Integer.MAX_VALUE;
        int maxTop = Integer.MIN_VALUE;
        int topCount = 0;

        for (int key : acidityLevels.keySet()) {
            if (acidityLevels.get(key) == mostFrequent) {
                topCount++;
                minTop = Math.min(minTop, key);
                maxTop = Math.max(maxTop, key);
            }
        }

        int difference = 0;

        if (topCount > 1) {
            difference = maxTop - minTop;
        } else {
            int topValue = 0;

            for (int key : acidityLevels.keySet()) {
                if (acidityLevels.get(key) == mostFrequent) {
                    topValue = key;
                    break;
                }
            }

            int secondMostFrequent = 0;
            for (int v : acidityLevels.values()) {
                if (v < mostFrequent && v > secondMostFrequent) {
                    secondMostFrequent = v;
                }
            }

            difference = 0;
            for (int key : acidityLevels.keySet()) {
                if (acidityLevels.get(key) == secondMostFrequent) {
                    difference = Math.max(difference, Math.abs(topValue - key));
                }
            }
        }

        System.out.println(difference);
    }
}