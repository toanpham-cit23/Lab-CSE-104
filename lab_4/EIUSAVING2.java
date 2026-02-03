import java.util.Scanner;

public class EIUSAVING2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        double[] yearlyRates = {3.90, 3.92, 3.95, 3.99, 4.04, 5.54, 5.72, 5.92, 6.14, 6.38, 6.64, 6.92};
        double totalFinalAmount = 0;

        for (int i = 0; i < n; i++) {
            double deposit = sc.nextDouble();

            // Số tháng còn lại mà khoản tiền này có thể sinh lãi
            int remainingMonths = n - i;

            // Tính số tiền khoản này đạt được sau khi áp dụng chiến thuật gửi kỳ hạn dài nhất
            double amountFromThisDeposit = deposit;
            int m = remainingMonths;

            // 1. Tận dụng tối đa các chu kỳ 12 tháng
            while (m >= 12) {
                amountFromThisDeposit += (amountFromThisDeposit * yearlyRates[11] / 100.0);
                m -= 12;
            }

            // 2. Gửi nốt số tháng dư còn lại (nếu có) vào kỳ hạn tương ứng
            if (m > 0)
                amountFromThisDeposit += (amountFromThisDeposit * yearlyRates[m - 1] / 100.0) * (m / 12.0);

            // Cộng dồn vào tổng số tiền cuối cùng nhận được
            totalFinalAmount += amountFromThisDeposit;
        }

        // In kết quả làm tròn đến hàng đơn vị
        System.out.println(Math.round(totalFinalAmount));
    }
}