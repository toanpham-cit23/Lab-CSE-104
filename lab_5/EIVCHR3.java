import java.util.Scanner;
import java.util.Arrays;

public class EIVCHR3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // món hàng
        int m = sc.nextInt(); // voucher
        long[] prices = new long[n];
        long totalSum = 0;

        for (int i = 0; i < n; i++) {
            prices[i] = sc.nextLong();
            totalSum += prices[i];
        }

        Arrays.sort(prices);

        long totalDiscount = 0;
        int vouchersToUse = Math.min(n, m);

        for (int i = 0; i < vouchersToUse; i++) {
            long currentPrice = prices[n - 1 - i];
            long discount = (currentPrice * 3) / 10;
            if (discount > 50000) {
                discount = 50000;
            }
            totalDiscount += discount;
        }
        System.out.println(totalSum - totalDiscount);
    }
}