import java.util.Scanner;

public class EIUCHRMS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] limits = {2000000, 5000000, 10000000, 20000000, 50000000, 100000000, 200000000};
        double[] rates = {0.03, 0.04, 0.05, 0.06, 0.07, 0.08, 0.09};
        double totalIncome = 0;

        for (int i = 0; i < n; i++) {
            long bill = sc.nextLong();
            double currentRate = 0.10;
            for (int j = 0; j < limits.length; j++) {
                if (bill <= limits[j]) {
                    currentRate = rates[j];
                    break;
                }
            }
            totalIncome += bill * (1 - currentRate);
        }

        System.out.println(Math.round(totalIncome));
    }
}