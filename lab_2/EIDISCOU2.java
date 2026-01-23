import java.util.Scanner;

public class EIDISCOU2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        double totalPay = 0;
        long[] thresholds = {900_000_000L, 600_000_000L, 300_000_000L, 100_000_000L, 20_000_000L, 5_000_000L};
        double[] payRates = {0.85, 0.88, 0.90, 0.93, 0.95, 0.97};
        long remaining = n;

        for (int i = 0; i < thresholds.length; i++) {
            if (remaining > thresholds[i]) {
                long amountInThisLevel = remaining - thresholds[i];
                totalPay += amountInThisLevel * payRates[i];
                remaining = thresholds[i];
                }
            }

        totalPay += remaining;

        System.out.printf("%.0f\n", totalPay);
    }
}