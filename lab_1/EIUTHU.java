import java.util.Scanner;

public class EIUTHU {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        String a = input.next();
        String b = input.next();
        int i = 1;
        int sameCharCount = 0;

        while(i <= a.length() && i <= b.length()) {
            if (a.substring(a.length() - i).equals(b.substring(0, i)))
                sameCharCount = i;
            i++;
        }
        System.out.println(a.length() + b.length() - sameCharCount);
    }
}