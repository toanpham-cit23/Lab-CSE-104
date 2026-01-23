import java.util.Scanner;

public class EIUSALES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long revenue = sc.nextLong();
        double totalBonus = 0;
        long[] limits = {0, 20, 50, 200, 500, 2000};
        double[] rates = {0.02, 0.03, 0.04, 0.05, 0.06, 0.07};
        double upperLimit;

        for (int i = 0; i < limits.length; i++) {
            if (revenue > limits[i]) {
                if (i == limits.length - 1)                                 // nếu là bậc cuối
                    upperLimit = revenue;
                else
                    upperLimit = Math.min(revenue, limits[i + 1]);          // xét 2 giá trị xem revenue hay limits tăng thêm 1 nhỏ hơn
                totalBonus += (upperLimit - limits[i]) * rates[i];          // (lấy điểm mốc - điểm limit thứ i) * tỉ lệ thứ i
            } else
                break;
        }

        System.out.println(Math.round(totalBonus * 1000) / 1000d);          // làm tròn lên 3 chữ số thập phân
    }
}