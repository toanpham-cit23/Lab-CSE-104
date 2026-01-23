import java.util.Scanner;

public class EIUTRIGLE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        int count = 0;
        for (int i = 0; i < n - 2; i++) {
            for (int j = i + 1; j < n - 1; j++) {
                for (int k = j + 1; k < n; k++) {
                    int side1 = a[i];
                    int side2 = a[j];
                    int side3 = a[k];
                    if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1) {
                        count++;
                    }
                }
            }
        }
        System.out.println(count);
    }
}