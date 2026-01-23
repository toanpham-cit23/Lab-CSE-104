import java.util.Scanner;

public class EIBANKFEE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            double balance = sc.nextDouble();
            int numChecks = sc.nextInt();

            double monthlyFee = 0;
            double perCheckFee = 0;

            if (balance < 500) {
                monthlyFee = 12.0;
                perCheckFee = 0.20;
            } else if (balance >= 500 && balance < 2000) {
                monthlyFee = 7.5;
                perCheckFee = 0.20;
            } else if (balance >= 2000 && balance < 5000) {
                monthlyFee = 5.0;
                perCheckFee = 0.10;
            } else {
                monthlyFee = 0;
                perCheckFee = 0;
            }

            double totalFee = monthlyFee + (numChecks * perCheckFee);

            if (totalFee == (long) totalFee) {
                System.out.printf("%d\n", (long) totalFee);
            } else {
                System.out.println(totalFee);
            }
        }
}