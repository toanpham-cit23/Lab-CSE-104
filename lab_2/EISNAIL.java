import java.util.Scanner;

public class EISNAIL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();                                     // leo lên A mét
        long B = sc.nextLong();                                     // giảm B mét
        long V = sc.nextLong();                                     // chiều cao V mét

        int days = (int)(1 + Math.ceil((double)(V - A)/(A - B)));   // 1 + (V-A)/(A-B) làm tròn lên, với (V-A)/(A-B) double
        System.out.println(days);
    }
}