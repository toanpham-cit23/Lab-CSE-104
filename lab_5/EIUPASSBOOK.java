import java.util.Scanner;

public class EIUPASSBOOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        int n = sc.nextInt();
        int m = sc.nextInt();
        double r1 = sc.nextDouble() / 100.0;
        double r2 = sc.nextDouble() / 100.0;

        // Lựa chọn 1: Chỉ nhận lại tiền gốc
        double option1 = x;

        // Lựa chọn 2: Vay thế chấp (Theo công thức thầy hướng dẫn)
        int t = n - m; // Tổng số tháng vay
        int years = t / 12;
        int months = t % 12;

        // Tính hệ số factor: Lãi kép cho năm + Lãi đơn cho tháng lẻ
        double factor = (1 + r2 * months / 12.0) * Math.pow(1 + r2, years);

        // Giá trị sổ tiết kiệm lúc đáo hạn (n tháng)
        double totalAtEnd = x * (1 + r1 * n / 12.0);

        // Số tiền nhận được tại thời điểm tháng m
        double option2 = totalAtEnd / factor;

        // Lấy giá trị lớn nhất và làm tròn đến hàng đơn vị
        System.out.println(Math.round(Math.max(option1, option2)));
    }
}