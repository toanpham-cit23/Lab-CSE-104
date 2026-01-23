import java.util.Scanner;

public class EIUMARKUP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            long n = sc.nextLong();
            long totalMoney = 0;
            long currentPrice = 200;
            long processed = 0;

            while (processed < n) {
                long remaining = n - processed;
                long countInBlock = Math.min(remaining, 100);
                totalMoney += countInBlock * currentPrice;
                processed += countInBlock;
                if (currentPrice > 180) {
                    currentPrice--;
                }
            }

            System.out.println(totalMoney);
        }
}