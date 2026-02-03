import java.util.Scanner;

public class EIUSAVING1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int m = sc.nextInt();

        double[] yearlyRates = {3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92};

        while (m >= 12) {
            // Lãi suất kỳ hạn 12 tháng: (n * 6.92 / 100)
            n = n + (n * yearlyRates[11] / 100.0);
            m -= 12;
        }

        // Nếu còn dư tháng (m < 12), gửi nốt kỳ hạn m tháng đó
        if (m > 0)
            // Lãi suất kỳ hạn m tháng: (n * Rate_m / 100) * (m / 12)
            n = n + (n * yearlyRates[m - 1] / 100.0) * (m / 12.0);

        System.out.println(Math.round(n));
    }
}