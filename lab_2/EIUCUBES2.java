import java.util.Scanner;

public class EIUCUBES2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int k = sc.nextInt();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < k; i++) {
            long n = sc.nextLong();
            long low = 0;
            long high = 2000000L;
            long ans = 0;

            while (low <= high) {
                long mid = low + (high - low) / 2;
                if (mid <= 0) {
                    ans = Math.max(ans, mid);
                    low = mid + 1;
                } else {
                    double total = (double) mid * (mid + 1) * (mid + 2) / 6.0;
                    if (total <= (double) n) {
                        ans = mid;
                        low = mid + 1;
                    } else
                        high = mid - 1;
                }
            }
            sb.append(ans).append(" ");
        }
        System.out.println(sb.toString().trim());
    }
}