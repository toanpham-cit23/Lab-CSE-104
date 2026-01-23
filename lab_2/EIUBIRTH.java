import java.util.Scanner;

public class EIUBIRTH {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
            int t = sc.nextInt();
            while (t-- > 0) {
                long b = sc.nextLong();
                long r = sc.nextLong();

                long x = sc.nextLong();
                long y = sc.nextLong();
                long z = sc.nextLong();

                long costPerBlue = Math.min(x, y + z);
                long costPerRed = Math.min(y, x + z);
                long totalCost = (b * costPerBlue) + (r * costPerRed);

                System.out.println(totalCost);
            }
    }
}