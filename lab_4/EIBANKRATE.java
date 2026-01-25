import java.util.Scanner;

public class EIBANKRATE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tien = sc.nextLong();
        int thang = sc.nextInt();
        double laiSuatThang = 0.09 / 12;
        double tongTien = tien * (1 + laiSuatThang * thang);
        System.out.println(tongTien);
    }
}
