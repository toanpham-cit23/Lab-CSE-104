import java.util.Scanner;

public class EIFING {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();

        int r = (int) (n % 18); // vị trí trong một chu kỳ đếm đi đếm lại
        if (r == 0)
            r = 18;

        int pos;
        if (r > 10) {
            pos = 20 - r;       // vị trí khi đếm ngược
        } else {
            pos = r;            // giữ nguyên khi đếm xuôi
        }

        String finger, hand;

        if (pos <= 5) {
            hand = "trai";      // 1-5 là tay trái
        } else {
            hand = "phai";      // 6-10 là tay phải
        }

        if (pos == 1 || pos == 10)
            finger = "cai";
        else if (pos == 2 || pos == 9)
            finger = "tro";
        else if (pos == 3 || pos == 8)
            finger = "giua";
        else if (pos == 4 || pos == 7)
            finger = "ap ut";
        else
            finger = "ut";

        System.out.println("Ngon " + finger + " cua ban tay " + hand);
    }
}