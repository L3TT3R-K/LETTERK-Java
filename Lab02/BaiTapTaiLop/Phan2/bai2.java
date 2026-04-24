package Lab02.BaiTapTaiLop.Phan2;

import java.util.ArrayList;
import java.util.Scanner;

abstract class ChuyenXe {
    protected String maSoChuyen;
    protected String hoTenTaiXe;
    protected String soXe;
    protected double khoiLuongHangHoa;
    protected double doanhThu;

    public ChuyenXe() {
    }

    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double khoiLuongHangHoa, double doanhThu) {
        this.maSoChuyen = maSoChuyen;
        this.hoTenTaiXe = hoTenTaiXe;
        this.soXe = soXe;
        this.khoiLuongHangHoa = khoiLuongHangHoa;
        this.doanhThu = doanhThu;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void nhap(Scanner sc) {
        System.out.print("Ma so chuyen: ");
        maSoChuyen = sc.nextLine();
        System.out.print("Ho ten tai xe: ");
        hoTenTaiXe = sc.nextLine();
        System.out.print("So xe: ");
        soXe = sc.nextLine();
        System.out.print("Khoi luong hang hoa: ");
        khoiLuongHangHoa = Double.parseDouble(sc.nextLine());
        System.out.print("Doanh thu: ");
        doanhThu = Double.parseDouble(sc.nextLine());
    }

    public void xuat() {
        System.out.println("Ma so chuyen: " + maSoChuyen);
        System.out.println("Ho ten tai xe: " + hoTenTaiXe);
        System.out.println("So xe: " + soXe);
        System.out.println("Khoi luong hang hoa: " + khoiLuongHangHoa);
        System.out.println("Doanh thu: " + doanhThu);
    }
}

class ChuyenNoiThanh extends ChuyenXe {
    private double quangDuongDi;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Quang duong di: ");
        quangDuongDi = Double.parseDouble(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("--- Chuyen noi thanh ---");
        super.xuat();
        System.out.println("Quang duong di: " + quangDuongDi);
    }
}

class ChuyenNgoaiThanh extends ChuyenXe {
    private String noiDen;
    private int soNgayVanChuyen;

    @Override
    public void nhap(Scanner sc) {
        super.nhap(sc);
        System.out.print("Noi den: ");
        noiDen = sc.nextLine();
        System.out.print("So ngay van chuyen: ");
        soNgayVanChuyen = Integer.parseInt(sc.nextLine());
    }

    @Override
    public void xuat() {
        System.out.println("--- Chuyen ngoai thanh ---");
        super.xuat();
        System.out.println("Noi den: " + noiDen);
        System.out.println("So ngay van chuyen: " + soNgayVanChuyen);
    }
}

public class bai2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<ChuyenNoiThanh> dsNoiThanh = new ArrayList<>();
        ArrayList<ChuyenNgoaiThanh> dsNgoaiThanh = new ArrayList<>();

        int tongSoChuyen;
        do {
            System.out.print("Nhap tong so chuyen (<= 20): ");
            tongSoChuyen = Integer.parseInt(sc.nextLine());
        } while (tongSoChuyen < 0 || tongSoChuyen > 20);

        for (int i = 0; i < tongSoChuyen; i++) {
            int loai;
            do {
                System.out.println("\nNhap chuyen thu " + (i + 1));
                System.out.print("Chon loai (1: Noi thanh, 2: Ngoai thanh): ");
                loai = Integer.parseInt(sc.nextLine());
            } while (loai != 1 && loai != 2);

            if (loai == 1) {
                ChuyenNoiThanh chuyen = new ChuyenNoiThanh();
                chuyen.nhap(sc);
                dsNoiThanh.add(chuyen);
            } else {
                ChuyenNgoaiThanh chuyen = new ChuyenNgoaiThanh();
                chuyen.nhap(sc);
                dsNgoaiThanh.add(chuyen);
            }
        }

        System.out.println("\n===== DANH SACH CHUYEN XE =====");
        for (ChuyenNoiThanh chuyen : dsNoiThanh) {
            chuyen.xuat();
            System.out.println("-------------------------");
        }
        for (ChuyenNgoaiThanh chuyen : dsNgoaiThanh) {
            chuyen.xuat();
            System.out.println("-------------------------");
        }

        double tongDoanhThuNoiThanh = tinhTongDoanhThuNoiThanh(dsNoiThanh);
        double tongDoanhThuNgoaiThanh = tinhTongDoanhThuNgoaiThanh(dsNgoaiThanh);

        System.out.println("Tong doanh thu noi thanh: " + tongDoanhThuNoiThanh);
        System.out.println("Tong doanh thu ngoai thanh: " + tongDoanhThuNgoaiThanh);

        ChuyenNoiThanh maxNoiThanh = timMaxNoiThanh(dsNoiThanh);
        ChuyenNgoaiThanh maxNgoaiThanh = timMaxNgoaiThanh(dsNgoaiThanh);

        if (maxNoiThanh != null) {
            System.out.println("\nChuyen noi thanh co doanh thu cao nhat:");
            maxNoiThanh.xuat();
        } else {
            System.out.println("\nKhong co chuyen noi thanh.");
        }

        if (maxNgoaiThanh != null) {
            System.out.println("\nChuyen ngoai thanh co doanh thu cao nhat:");
            maxNgoaiThanh.xuat();
        } else {
            System.out.println("\nKhong co chuyen ngoai thanh.");
        }

        sc.close();
    }

    public static double tinhTongDoanhThuNoiThanh(ArrayList<ChuyenNoiThanh> ds) {
        double tong = 0;
        for (ChuyenNoiThanh chuyen : ds) {
            tong += chuyen.getDoanhThu();
        }
        return tong;
    }

    public static double tinhTongDoanhThuNgoaiThanh(ArrayList<ChuyenNgoaiThanh> ds) {
        double tong = 0;
        for (ChuyenNgoaiThanh chuyen : ds) {
            tong += chuyen.getDoanhThu();
        }
        return tong;
    }

    public static ChuyenNoiThanh timMaxNoiThanh(ArrayList<ChuyenNoiThanh> ds) {
        if (ds.isEmpty()) {
            return null;
        }
        ChuyenNoiThanh max = ds.get(0);
        for (ChuyenNoiThanh chuyen : ds) {
            if (chuyen.getDoanhThu() > max.getDoanhThu()) {
                max = chuyen;
            }
        }
        return max;
    }

    public static ChuyenNgoaiThanh timMaxNgoaiThanh(ArrayList<ChuyenNgoaiThanh> ds) {
        if (ds.isEmpty()) {
            return null;
        }
        ChuyenNgoaiThanh max = ds.get(0);
        for (ChuyenNgoaiThanh chuyen : ds) {
            if (chuyen.getDoanhThu() > max.getDoanhThu()) {
                max = chuyen;
            }
        }
        return max;
    }
}