import java.util.Scanner;

public class EIEVERYN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        short T = sc.nextShort();

        while (T-- > 0) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            boolean[] visited = new boolean[n + 1];
            int countUnique = 0;

            for (int i = 0; i < m; i++) {
                int a = sc.nextInt();
                if (a >= 1 && a <= n && !visited[a]) {
                    visited[a] = true;
                    countUnique++;
                }
            }

            if (countUnique == n) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}