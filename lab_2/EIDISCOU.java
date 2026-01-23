import java.util.Scanner;

public class EIDISCOU {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double N = sc.nextDouble();
        double discount = 0;
        double[] money = {2000000, 10000000, 50000000, 100000000, 200000000, 500000000, Long.MAX_VALUE};
        double[] rates = {0.03, 0.05, 0.07, 0.10, 0.12, 0.15};

        for (int i = 0; i < rates.length; i++) {
            if (N > money[i]) {
                if (N > money[i + 1]) {
                    discount += (money[i + 1] - money[i]) * rates[i];
                } else
                    discount += (N - money[i]) * rates[i];
            }
        }
        System.out.println(Math.round(N - discount));
    }
}