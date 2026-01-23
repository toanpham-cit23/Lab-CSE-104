import java.util.Scanner;

public class EIUCUBES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int layers = 1;

        while (n >= layers * (layers + 1) / 2) {
            n -= layers * (layers + 1) / 2;
            layers++;
        }

        System.out.println(layers - 1);
    }
}