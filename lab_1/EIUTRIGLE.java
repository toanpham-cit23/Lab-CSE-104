import java.util.Arrays;
import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);

        int count = 0;
        for (int k = n - 1; k >= 2; k--) {
            int i = 0;
            int j = k - 1;
            while (i < j) {
                if (a[i] + a[j] > a[k]) {
                    count += (j - i);
                    j--;
                } else
                    i++;
            }
        }
        System.out.println(count);
    }
}