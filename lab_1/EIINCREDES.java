import java.util.Scanner;

public class EIINCREDES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        boolean isIncreasing = true;
        boolean isDecreasing = true;
        for (int i = 1; i < n; i++) {
            if (a[i] <= a[i - 1]) {
                isIncreasing = false;
            }
            if (a[i] >= a[i - 1]) {
                isDecreasing = false;
            }
        }
        if (isIncreasing) {
            System.out.println("increasing");
        } else if (isDecreasing) {
            System.out.println("decreasing");
        } else {
            System.out.println("none");
        }
    }
}