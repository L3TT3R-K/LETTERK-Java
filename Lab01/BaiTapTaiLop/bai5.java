

import java.util.Scanner;


public class bai5 {
    public static void run(Scanner sc) {
        Integer soTienDien = nhapSoDien(sc);
        if (soTienDien == null) {
            return;
        }
        long tienDien = tinhTienDien(soTienDien);
        System.out.println("So tien dien phai tra la: " + tienDien + " dong");
    }

    public static Integer nhapSoDien(Scanner sc) {
        System.out.print("Nhap so dien su dung cua thang (kWh): ");
        if (!sc.hasNextInt()) {
            System.out.println("Gia tri khong hop le. Vui long nhap so nguyen duong.");
            if (sc.hasNextLine()) sc.nextLine();
            return null;
        }

        int soTienDien = sc.nextInt();
        if (soTienDien < 0) {
            System.out.println("So dien phai la so khong am.");
            return null;
        }

        return soTienDien;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

    public static long tinhTienDien(int soTienDien) {
        int tienDien = 0;

        if(soTienDien <= 50) {
            tienDien = soTienDien * 2000;
        } 
        else if(soTienDien <= 100) {
            tienDien = 50 * 2000 + (soTienDien - 50) * 2500;
            } 
        else {
            tienDien = 50 * 2000 + 50 * 2500 + (soTienDien - 100) * 3500   ;
        }
        return tienDien;
    }
}
