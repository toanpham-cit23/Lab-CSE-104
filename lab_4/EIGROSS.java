import java.util.Scanner;

public class EIGROSS {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            double afterTaxIncome = sc.nextDouble();
            double tax = afterTaxIncome / 9;
            System.out.println(tax);
        }
    }
}