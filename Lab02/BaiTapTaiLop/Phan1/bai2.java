package Lab02.BaiTapTaiLop.Phan1;

import java.util.*;
class HinhChuNhat {
    private double chieuDai;
    private double chieuRong;
    public HinhChuNhat(){}
    public HinhChuNhat(double cd, double cr){
        chieuDai = cd;
        chieuRong = cr;
    }
    public double getChieuDai(){
        return chieuDai;
    }
    public double getChieuRong(){
        return chieuRong;
    }
    public double tinhDienTich(){
        return chieuDai * chieuRong;
    }
    public double tinhChuVi(){
        return (chieuDai + chieuRong) * 2;
    }
    public String toString(){
        return "Chieu dai hinh chu nhat: " + chieuDai + "\n" +
                "Chieu rong hinh chu nhat: " + chieuRong + "\n" +
                "Dien tich hinh chu nhat: " + tinhDienTich() + "\n" +
                "Chu vi hinh chu nhat: " + tinhChuVi();
    }
}
public class bai2 {
   static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Nhap chieu dai hinh chu nhat: ");
        double chieuDai = sc.nextDouble();
        System.out.println("Nhap chieu rong hinh chu nhat: ");
        double chieuRong = sc.nextDouble();
        HinhChuNhat hcn = new HinhChuNhat(chieuDai, chieuRong);
        System.out.println(hcn);
    }
}
