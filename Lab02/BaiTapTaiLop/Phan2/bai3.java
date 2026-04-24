package Lab02.BaiTapTaiLop.Phan2;

import java.util.Scanner;
import java.util.Random;

abstract class Robot {
    protected int m; 

    public Robot(int m) {
        this.m = m;
    }

    public Robot() {}

    abstract int tinhNangLuongTieuThu();
    abstract void inThongTin();
}

// ================= PEDION =================
class Pedion extends Robot {
    protected int f; 

    public Pedion() {
        super(20);
    }

    public Pedion(int f) {
        super(20);
        this.f = f;
    }

    int tinhNangLuongTieuThu() {
        return m * 10 + (f + 1) * 5;
    }

    void inThongTin() {
        System.out.println("Pedion | M=" + m + ", F=" + f +
                ", NL=" + tinhNangLuongTieuThu());
    }
}

// ================= ZATTACKER =================
class Zattacker extends Robot {
    protected int p; 

    public Zattacker() {
        super(50);
    }

    public Zattacker(int p) {
        super(50);
        this.p = p;
    }

    int tinhNangLuongTieuThu() {
        return m * 10 + p * p * 10;
    }

    void inThongTin() {
        System.out.println("Zattacker | M=" + m + ", P=" + p +
                ", NL=" + tinhNangLuongTieuThu());
    }
}

// ================= CARRIER =================
class Carrier extends Robot {
    protected int e; 

    public Carrier() {
        super(30);
    }

    public Carrier(int e) {
        super(30);
        this.e = e;
    }

    int tinhNangLuongTieuThu() {
        return m * 10 + 4 * e * 10;
    }

    void inThongTin() {
        System.out.println("Carrier | M=" + m + ", E=" + e +
                ", NL=" + tinhNangLuongTieuThu());
    }
}

// ================= MAIN =================
public class bai3 {
    public static void main(String[] args) {
        int a, b, c;
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhap so Pedion: ");
        a = sc.nextInt();
        System.out.print("Nhap so Zattacker: ");
        b = sc.nextInt();
        System.out.print("Nhap so Carrier: ");
        c = sc.nextInt();

        Robot[] robots = new Robot[a + b + c];

        for (int i = 0; i < a; i++) {
            robots[i] = new Pedion(rand.nextInt(5) + 1);
        }

        for (int i = a; i < a + b; i++) {
            robots[i] = new Zattacker(rand.nextInt(11) + 20);
        }

        for (int i = a + b; i < a + b + c; i++) {
            robots[i] = new Carrier(rand.nextInt(51) + 50);
        }

        long tongP = 0, tongZ = 0, tongC = 0;

        for (Robot r : robots) {
            r.inThongTin();
            if (r instanceof Pedion) tongP += r.tinhNangLuongTieuThu();
            else if (r instanceof Zattacker) tongZ += r.tinhNangLuongTieuThu();
            else tongC += r.tinhNangLuongTieuThu();
        }

        System.out.println("\nTong Pedion: " + tongP);
        System.out.println("Tong Zattacker: " + tongZ);
        System.out.println("Tong Carrier: " + tongC);

        sc.close();
    }
}