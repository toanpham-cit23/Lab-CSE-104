import java.util.Scanner;

public class EIVCHR2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long totalSum = 0;
        long maxDiscount = 0;

        for (int i = 0; i < n; i++) {
            long price = sc.nextLong();
            totalSum += price;
            long currentDiscount = (price * 3) / 10;
            if (currentDiscount > 50000)
                currentDiscount = 50000;
            if (currentDiscount > maxDiscount)
                maxDiscount = currentDiscount;
        }
        System.out.println(totalSum - maxDiscount);
    }
}