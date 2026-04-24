package Lab02.BaiTapTaiLop.Phan1;

import java.util.*;
class SinhVien {
    private int maSV;
    private String hoTen;
    private double diemLT, diemTH;
    public SinhVien(){
        maSV = 0;
        hoTen = "";
        diemLT = 0;
        diemTH = 0;
    }
    public SinhVien(int maSV, String hoTen, double diemLT, double diemTH){
        this.maSV = maSV;
        this.hoTen = hoTen;
        setDiemLT(diemLT);
        setDiemTH(diemTH);
    }
    public int getMaSV(){
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public double getDiemLT() {
        return diemLT;
    }

    public double getDiemTH() {
        return diemTH;
    }
    public void setMaSV(int maSV){
        this.maSV = maSV;
    }
    public void setHoTen(String hoTen){
        this.hoTen = hoTen;
    }

    public void setDiemLT(double diemLT){
        if(diemLT >= 0 && diemLT <= 10)
            this.diemLT = diemLT;
        else
            this.diemLT = 0;
    }
    public void setDiemTH(double diemTH){
        if(diemTH >= 0 && diemTH <= 10)
            this.diemTH = diemTH;
        else
            this.diemTH = 0;
    }
    public double tinhTrungBinh(){
        return (diemLT + diemTH) / 2;
    }
    public String toString(){
        return "Ma sinh vien: " + maSV + "\n" +
                "Ho ten: " + hoTen + "\n" +
                "Diem ly thuyet: " + diemLT + "\n" +
                "Diem thuc hanh: " + diemTH + "\n" +
                "Diem trung binh cua sinh vien: " + tinhTrungBinh();
    }
}
public class bai3 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        SinhVien sv1, sv2, sv3;
        System.out.println("Nhap thong tin sinh vien 1");
        System.out.println("Nhap ma sinh vien: ");
        int maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        double diemLT = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh: ");
        double diemTH = sc.nextDouble();
        sv1 = new SinhVien(maSV, hoTen, diemLT, diemTH);
        System.out.println("Nhap thong tin sinh vien 2");
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        diemLT = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh: ");
        diemTH = sc.nextDouble();
        sv2 = new SinhVien(maSV, hoTen, diemLT, diemTH);
        System.out.println("Nhap thong tin sinh vien 3");
        System.out.println("Nhap ma sinh vien: ");
        maSV = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap diem ly thuyet: ");
        diemLT = sc.nextDouble();
        System.out.println("Nhap diem thuc hanh: ");
        diemTH = sc.nextDouble();
        sv3 = new SinhVien(maSV, hoTen, diemLT, diemTH);
        System.out.println("\nDANH SACH SINH VIEN");
        System.out.printf("%-10s %-20s %-10s %-10s %-10s\n",
                "MaSV", "HoTen", "DiemLT", "DiemTH", "DiemTB");
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                sv1.getMaSV(), sv1.getHoTen(), sv1.getDiemLT(), sv1.getDiemTH(), sv1.tinhTrungBinh());
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                sv2.getMaSV(), sv2.getHoTen(), sv2.getDiemLT(), sv2.getDiemTH(), sv2.tinhTrungBinh());
        System.out.printf("%-10d %-20s %-10.2f %-10.2f %-10.2f\n",
                sv3.getMaSV(), sv3.getHoTen(), sv3.getDiemLT(), sv3.getDiemTH(), sv3.tinhTrungBinh());
    }
}
