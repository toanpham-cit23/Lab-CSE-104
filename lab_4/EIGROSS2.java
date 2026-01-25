import java.util.Scanner;

public class EIGROSS2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long netSalary = sc.nextLong();
        double taxableNet = netSalary - 11_000_000.0;
        double[] beforeTax = {0, 5000000, 10000000, 18000000, 32000000, 52000000, 80000000};
        double[] rates = {0.05, 0.10, 0.15, 0.20, 0.25, 0.30, 0.35};
        double[] afterTax = {0, 4750000, 9250000, 16050000, 27250000, 42250000, 61850000};
        double finalGross;

        if (taxableNet <= 0)
            finalGross = (double) netSalary;
        else {
            double taxableGross = 0;
            for (int i = 6; i >= 0; i--) {
                if (taxableNet > afterTax[i]) {
                    // Công thức tính ngược: Gross = Mốc_dưới + (Net - Net_mốc_dưới) / (1 - rate)
                    taxableGross = beforeTax[i] + (taxableNet - afterTax[i]) / (1 - rates[i]);
                    break;
                }
            }
            finalGross = taxableGross + 11_000_000.0;
        }
        System.out.println(Math.round(finalGross));
    }
}