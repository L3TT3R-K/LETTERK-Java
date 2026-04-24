package Lab02.BaiTapTaiLop.Phan1;

import java.util.*;
class Xe {
    private String tenChuXe;
    private String loaiXe;
    private double triGiaXe;
    private double dungTich;
    public Xe(){}
    public Xe(String t, String lx, double tg, double dt){
        tenChuXe = t;
        loaiXe = lx;
        triGiaXe = tg;
        dungTich = dt;
    }
    public double tinhThue(){
        if(dungTich < 100) return triGiaXe * 0.01;
        if(dungTich >= 100 && dungTich <= 175) return triGiaXe * 0.03;
        if(dungTich > 175) return triGiaXe * 0.05;
        return 0;
    }

    public String getTenChuXe() {
        return tenChuXe;
    }

    public String getLoaiXe() {
        return loaiXe;
    }

    public double getTriGiaXe() {
        return triGiaXe;
    }

    public double getDungTich() {
        return dungTich;
    }
}
public class bai4 {
  static Scanner sc = new Scanner(System.in);
    public static void Nhap(Xe[] ds) {
        int i = 0;
        while (true) {
            System.out.println("Nhap xe thu " + (i + 1));
            System.out.println("Nhap ten chu xe: ");
            String ten = sc.nextLine();
            if(ten.isEmpty()) break;
            System.out.println("Nhap loai xe: ");
            String lx = sc.nextLine();
            System.out.println("Nhap tri gia xe: ");
            double tg = sc.nextDouble();
            System.out.println("Nhap dung tich xy lanh(cc): ");
            double dt = sc.nextDouble();
            sc.nextLine();
            ds[i++] = new Xe(ten, lx, tg, dt);
        }
    }
    public static void Xuat(Xe[] ds){
        System.out.println("\n------ BANG KE KHAI THUE ------");
        System.out.printf("%-20s %-15s %-15s %-15s %-15s\n",
                "Ten chu xe", "Loai xe", "Tri gia", "Dung tich", "Thue");
        for(Xe p : ds){
            if(p == null) break;
            System.out.printf("%-20s %-15s %-15.2f %-15.0f %-15.2f\n",
                    p.getTenChuXe(),
                    p.getLoaiXe(),
                    p.getTriGiaXe(),
                    p.getDungTich(),
                    p.tinhThue());
        }
    }
    public static void TimKiem(Xe[] ds){
        System.out.println("Nhap ten chu xe: ");
        String ten = sc.nextLine();
        System.out.println("Nhap loai xe: ");
        String lx = sc.nextLine();
        for(Xe p : ds){
            if(p == null) break;
            if(p.getTenChuXe().equals(ten) && p.getLoaiXe().equals(lx)){
                System.out.print("Thue phai dong cua chu xe nay: ");
                System.out.println(p.tinhThue());
                return;
            }
        }
        System.out.println("Khong tim thay!");
    }

    public static void main(String[] args) {
        Xe[] ds = new Xe[100];
        Nhap(ds);
        Xuat(ds);
        sc.nextLine();
        TimKiem(ds);
    }
}
