import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Graph {

    public int findMaxNestingSequence(List<Box> boxes) {
        // Ordena as caixas
        Collections.sort(boxes);

        int n = boxes.size();
        int[] dp = new int[n];
        Arrays.fill(dp, 1);

        int maxLength = 1;

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (boxes.get(j).canNestInside(boxes.get(i))) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxLength = Math.max(maxLength, dp[i]);
        }

        return maxLength;
    }
}
