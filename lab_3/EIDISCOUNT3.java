import java.util.Scanner;

public class EIDISCOUNT3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int online = sc.nextInt();
        int vip = sc.nextInt();
        int supersaiyancard = sc.nextInt();
        long[] thresholds = {900_000_000L, 600_000_000L, 300_000_000L, 100_000_000L, 20_000_000L, 5_000_000L};
        int[] discountPercents = {15, 12, 10, 7, 5, 3};
        double totalDiscount = 0;
        long remaining = n;

        for (int i = 0; i < thresholds.length; i++) {
            if (remaining > thresholds[i]) {
                long amountInThisLevel = remaining - thresholds[i];
                totalDiscount += (double) amountInThisLevel * discountPercents[i] / 100.0;
                remaining = thresholds[i];
            }
        }
        double currentBill = (double) n - totalDiscount;
        if (online == 1)
            currentBill *= 0.98;
        if (vip == 1)
            currentBill *= 0.98;
        if (supersaiyancard == 1)
            currentBill *= 0.98;

        System.out.println(Math.round(currentBill));
    }
}