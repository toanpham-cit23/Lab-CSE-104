import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long total = 0;

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            double discount = 0;
            if (total > 200_000_000L)      discount = price * 0.07;
            else if (total > 50_000_000L)  discount = price * 0.05;
            else if (total > 20_000_000L)  discount = price * 0.03;
            else if (total > 1_000_000L)   discount = price * 0.02;
            if (discount == (long) discount)
                sb.append((long) discount).append(".0");
            else
                sb.append(discount);
            if (i < n - 1) sb.append(" ");
            total += price;
        }
        System.out.print(sb);
    }
}