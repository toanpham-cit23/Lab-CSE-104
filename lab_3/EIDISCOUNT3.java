import java.util.Scanner;

public class EIDISCOUNT3_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long money = sc.nextLong();
        int online = sc.nextInt();
        int vip = sc.nextInt();
        int supersaiyancard = sc.nextInt();
        long origin = money;
        long discount = 0;
        long[] thresholds = {900_000_000L, 600_000_000L, 300_000_000L, 100_000_000L, 20_000_000L, 5_000_000L};
        int[] rates = {15, 12, 10, 7, 5, 3};

        for (int i = 0; i < thresholds.length; i++) {
            if (origin > thresholds[i]) {
                discount += (origin - thresholds[i]) * rates[i] / 100;
                origin = thresholds[i];
            }
        }

        long current = money - discount;
        if (online == 1)
            current = current * 98 / 100;
        if (vip == 1)
            current = current * 98 / 100;
        if (supersaiyancard == 1)
            current = current * 98 / 100;

        System.out.println(current);
    }
}