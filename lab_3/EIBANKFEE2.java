import java.util.Scanner;

public class EIBANKFEE2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double totalFeesAllAccounts = 0;
        long totalChecksAllAccounts = 0;

        for (int i = 0; i < n; i++) {
            double balance = sc.nextDouble();
            int numChecks = sc.nextInt();
            double monthlyFee = 0;
            double feePerCheck = 0;
            if (balance < 500) {
                monthlyFee = 12.0;
                feePerCheck = 0.20;
            } else if (balance < 2000) {
                monthlyFee = 7.5;
                feePerCheck = 0.20;
            } else if (balance < 5000) {
                monthlyFee = 5.0;
                feePerCheck = 0.10;
            } else {
                monthlyFee = 0;
                feePerCheck = 0;
            }
            totalFeesAllAccounts += monthlyFee + (numChecks * feePerCheck);
            totalChecksAllAccounts += numChecks;
        }
        if (totalChecksAllAccounts > 0) {
            double result = totalFeesAllAccounts / totalChecksAllAccounts;
            System.out.println(result);
        } else
            System.out.println(0);
    }
}