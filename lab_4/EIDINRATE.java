import java.util.Scanner;

public class EIDINRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            double n = sc.nextDouble(); // Vốn
            double l = sc.nextDouble(); // Lãi (%)
            double m = sc.nextDouble(); // Mục tiêu
            double r = l / 100.0;
            double years = Math.log(m / n) / Math.log(1 + r);
            System.out.println((int) Math.ceil(years));
        }
    }
}