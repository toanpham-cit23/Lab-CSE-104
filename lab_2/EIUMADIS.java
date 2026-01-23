import java.util.Scanner;

public class EIUMADIS {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] a = new long[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        long min = a[0];                // Cho min = pt đầu
        long maxDiff = 0;               // Cho max = 0

        for (int j = 1; j < n; j++) {   // Đếm từ 1 -> n
            if (a[j] - min > maxDiff)   // pt thứ j - pt đầu = max
                maxDiff = a[j] - min;   // max = pt thứ j - pt đầu
            if (a[j] < min)             // pt thứ j nhỏ hơn pt đầu
                min = a[j];             // pt đầu = pt thứ j
        }
        System.out.println(maxDiff);
    }
}