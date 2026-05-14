package Lab02.BaiTapTaiLop.Phan1;

import java.util.*;
class Point {
    private double x;
    private double y;
    Point(){}
    Point(double xx, double yy){
        this.x = xx;
        this.y = yy;
    }
    public double khoangCach(Point P){
        double ketQua;
        ketQua = Math.sqrt(Math.pow(P.x - this.x, 2) + Math.pow(P.y - this.y, 2));
        return ketQua;
    }
    public void xuatThongTin(){
        System.out.print("(" + x + ", " + y + ")");
    }
}
public class bai1 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        Point P1, P2;
        System.out.println("Nhap diem thu nhat: ");
        double x1 = sc.nextDouble();
        double y1 = sc.nextDouble();
        P1 = new Point(x1, y1);
        System.out.println("Nhap diem thu hai: ");
        double x2 = sc.nextDouble();
        double y2 = sc.nextDouble();
        P2 = new Point(x2, y2);
        System.out.print("Diem thu nhat: ");
        P1.xuatThongTin();
        System.out.println();
        System.out.print("Diem thu hai: ");
        P2.xuatThongTin();
        System.out.println();
        System.out.println("Khoang cach giua hai diem la: " + P1.khoangCach(P2));
    }
}
