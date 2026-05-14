
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class bai4 {
    public static String nhapChuoi(Scanner sc, String tenChuoi) {
        System.out.println("Nhap chuoi " + tenChuoi + ": ");
        return sc.nextLine();
    }

    public static void xuLyChuoi(String x, String y) {
        System.out.println("Tong chieu dai cua x la: " + x.length());

        if (x.length() >= 3) {
            System.out.println("3 ki tu dau cua chuoi x la: " + x.substring(0, 3));
            System.out.println("3 ki tu cuoi cua chuoi x la: " + x.substring(x.length() - 3));
        } else {
            System.out.println("Chuoi x phai co it nhat 3 ki tu de thuc hien substring(3)");
        }

        if (x.length() >= 6) {
            System.out.println("Ky tu thu 6 cua chuoi x la: " + x.charAt(5));
        } else {
            System.out.println("Chuoi x phai co it nhat 6 ki tu de lay ky tu");
        }

        if (x.length() >= 3 && y.length() >= 3) {
            String z = x.substring(0, 3) + y.substring(y.length() - 3);
            System.out.println("Chuoi moi gom 3 ky tu dau cua x va 3 ky tu cuoi cua y la: " + z);
        } else {
            System.out.println("De tao chuoi moi can x va y deu co it nhat 3 ky tu");
        }

        if(x != null && x.equals(y)) {
            System.out.println("Hai chuoi x va y giong nhau");
        } else {
            System.out.println("Hai chuoi x va y khac nhau");
        }
        if(x != null && x.equalsIgnoreCase(y)) {
            System.out.println("Hai chuoi x va y giong nhau khong phan biet chu hoa chu thuong");
        } else {
            System.out.println("Hai chuoi x va y khac nhau khong phan biet chu hoa chu thuong");
        }

        if(x != null && x.indexOf(y) != -1) {
            System.out.println("Chuoi y xuat hien trong chuoi x");
        } else {
            System.out.println("Chuoi y khong xuat hien trong chuoi x");
        }

        List<Integer> viTri = new ArrayList<>();

        int index = 0;
        while(true) {
            int pos = x.indexOf(y, index);
            if(pos == -1) {
                break;
            }
            viTri.add(pos);
            index = pos + 1;
        }
        System.out.println("Tat ca cac vi tri cua chuoi y trong chuoi x la: " + viTri);
    }

    public static void run(Scanner sc) {
        String x = nhapChuoi(sc, "x");
        String y = nhapChuoi(sc, "y");
        xuLyChuoi(x, y);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }
}

