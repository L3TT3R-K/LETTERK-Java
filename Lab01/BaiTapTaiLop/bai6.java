

import java.util.Scanner;

public class bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("##################################");
            System.out.println("1.                           Bai 1");
            System.out.println("2.                           Bai 2");
            System.out.println("3.                           Bai 3");
            System.out.println("4.                           Bai 4");
            System.out.println("5.                           Bai 5");
            System.out.println("6.                           Thoat");
            System.out.println("##################################");
            System.out.print("Chon chuc nang: ");

            if (!sc.hasNextInt()) {
                System.out.println("Vui long nhap 1 so tu 1 den 6.");
                if (sc.hasNextLine()) sc.nextLine();
                continue;
            }

            int chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    System.out.println("Ban da chon Bai 1");
                    bai1.run(sc);
                    break;
                case 2:
                    System.out.println("Ban da chon Bai 2");
                    bai2.run(sc);
                    break;
                case 3:
                    System.out.println("Ban da chon Bai 3");
                    bai3.run(sc);
                    break;
                case 4:
                    System.out.println("Ban da chon Bai 4");
                    bai4.run(sc);
                    break;
                case 5:
                    System.out.println("Ban da chon Bai 5");
                    bai5.run(sc);
                    break;
                case 6:
                    System.out.println("Thoat chuong trinh. Tam biet!");
                    sc.close();
                    return;
                default:
                    System.out.println("Vui long chon tu 1 den 6.");
            }

            System.out.println();
        }
    }
}