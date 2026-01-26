import java.util.Scanner;

public class EIMEMCARD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int items = sc.nextInt();
        long[] amount = new long[items];
        for (int i = 0; i < amount.length; i++) {
            amount[i] = sc.nextLong();
        }
        long[] levels = { 0, 1_000_000, 20_000_000, 50_000_000, 200_000_000, Long.MAX_VALUE / 2 };
        double[] rates = { 0, 0.02, 0.03, 0.05, 0.07 };
        double discount = 0;
        long spending = 0;
        for (int i = 0; i < amount.length; i++) {
            for (int j = 0; j < levels.length; j++) {
                if (spending < levels[j]) {
                    discount = amount[i] * rates[j - 1];
                    sb.append(discount).append(" ");
                    break;
                }

            }
            spending += amount[i];
        }
        System.out.println(sb.toString());
    }
}
