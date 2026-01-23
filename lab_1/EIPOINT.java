import java.util.Scanner;

public class EIPOINT {
    static Scanner input = new Scanner( System.in );
    public static void main(String[] args) {
        short n = input.nextShort();
        int[] point = new int[] {90, 85, 80, 75, 70, 65, 60, 55, 53, 52, 50, 0};
        String[] gradeWords = new String[] {"A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "F"};
        if (n > 100 || n < 0)
            System.out.println("Invalid input");
        else {
            for (int i = 0; i < gradeWords.length; i++)
                if (n >= point[i]) {
                    System.out.println(gradeWords[i]);
                    break;
                }
        }
    }
}