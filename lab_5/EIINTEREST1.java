import java.util.Scanner;

public class EIINTEREST1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double rate = sc.nextDouble();
        double amount = 0;
        for (int i = 0; i < 12; i++) {
            long deposit = sc.nextLong();
            amount += deposit;
            amount = amount * (1 + rate);
        }
        System.out.println(Math.round(amount));
    }
}