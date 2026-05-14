
import java.util.Scanner;


public class bai2 {
    public static Integer nhapSoNguyen(Scanner sc, String tenBien) {
        System.out.print("Nhap " + tenBien + ": ");
        if (!sc.hasNextInt()) {
            System.out.println("Gia tri " + tenBien + " khong hop le. Vui long nhap so nguyen.");
            if (sc.hasNextLine()) sc.nextLine();
            return null;
        }
        return sc.nextInt();
    }

    public static Double tinhThuong(int a, int b) {
        if (b == 0) {
            System.out.println("Khong the chia cho 0.");
            return null;
        }
        return (double) a / b;
    }

    public static void run(Scanner sc) {
        System.out.println("Nhap 2 so a va b:");
        Integer a = nhapSoNguyen(sc, "a");
        if (a == null) {
            return;
        }
        Integer b = nhapSoNguyen(sc, "b");
        if (b == null) {
            return;
        }
        Double chia = tinhThuong(a, b);
        if (chia == null) {
            return;
        }
        System.out.printf("Ket qua a/b la: %.3f", chia);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

}
