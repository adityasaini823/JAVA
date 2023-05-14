import java.util.*;

public class knapsackProblem {
    public static void main(String[] args) {
        int profit[] = { 60, 100, 120 };
        int weight[] = { 10, 20, 30 };
        int W = 50;
        double ratio[][] = new double[weight.length][2];
        for (int i = 0; i < weight.length; i++) {
            ratio[i][0] = i;
            ratio[i][1] = profit[i] / (double) weight[i];
            System.out.println(ratio[i][0] + " " + ratio[i][1]);
        }
        Arrays.sort(ratio, Comparator.comparingDouble(o -> o[1]));
        int remainingW = W;
        int TotalValue = 0;

        for (int i = ratio.length - 1; i >= 0; i--) {
            int index = (int) ratio[i][0];
            if (remainingW >=weight[index]) {
                TotalValue = TotalValue + profit[index];
                remainingW = remainingW - weight[index];
            } else {
                TotalValue = TotalValue + (int) (ratio[i][1] * (double) remainingW);
                remainingW = 0;
                break;
            }
        }
        System.out.println(TotalValue);

    }
}
