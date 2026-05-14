
import java.util.Scanner;

public class bai1 {
    public static Integer nhapBanKinh(Scanner sc) {
        System.out.print("Nhap ban kinh hinh tron: ");
        if (!sc.hasNextInt()) {
            System.out.println("Gia tri khong hop le. Vui long nhap so nguyen.");
            if (sc.hasNextLine()) sc.nextLine();
            return null;
        }
        int r = sc.nextInt();
        if (r < 0) {
            System.out.println("Ban kinh phai la so khong am.");
            return null;
        }
        return r;
    }

    public static double tinhChuVi(int banKinh) {
        return 2 * Math.PI * banKinh;
    }

    public static void run(Scanner sc) {
        Integer banKinh = nhapBanKinh(sc);
        if (banKinh == null) {
            return;
        }
        double chuVi = tinhChuVi(banKinh);
        System.out.printf("Chu vi hinh tron la: %.2f\n", chuVi);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}
