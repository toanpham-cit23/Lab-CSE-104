import java.util.Scanner;

public class EIMONEY {
    static Scanner input = new Scanner( System.in );
    public static void main(String[] args) {
        int n = input.nextInt();
        int[] bankNotes = new int[] {20, 10, 5, 1};                         // money exchange
        for (int bankNote : bankNotes) {
            if (n >= bankNote) {
                System.out.println(bankNote + " " + n / bankNote);
                n -= bankNote * (n / bankNote);
            }
        }
    }
}
