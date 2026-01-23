import java.util.Scanner;

public class EIAUCTION {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] outcomes = new int[n];
        int[] count = new int[7];

        for (int i = 0; i < n; i++) {
            outcomes[i] = sc.nextInt();
            count[outcomes[i]]++;
        }

        int index = -1;
        int maxUnique = -1;

        for (int i = 0; i < n; i++) {
            int val = outcomes[i];
            if (count[val] == 1) {
                if (val > maxUnique) {
                    maxUnique = val;
                    index = i + 1;
                }
            }
        }

        if (index != -1)
            System.out.println(index);
        else
            System.out.println("none");
    }
}