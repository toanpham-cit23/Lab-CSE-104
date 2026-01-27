import java.util.Scanner;

public class EIVCHR1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long discountAmount = (n * 3) / 10;
        if (discountAmount > 50000)
            discountAmount = 50000;
        long result = n - discountAmount;
        System.out.println(result);
    }
}