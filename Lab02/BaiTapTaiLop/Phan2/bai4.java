package Lab02.BaiTapTaiLop.Phan2;

abstract class Xe {
	protected double khoiLuongHang; // kg
	protected double luongXang; // lit

	public void themHang(double khoiLuong) {
		if (khoiLuong > 0) {
			khoiLuongHang += khoiLuong;
		}
	}

	public void botHang(double khoiLuong) {
		if (khoiLuong > 0) {
			khoiLuongHang -= khoiLuong;
			if (khoiLuongHang < 0) {
				khoiLuongHang = 0;
			}
		}
	}

	public void doXang(double soLit) {
		if (soLit > 0) {
			luongXang += soLit;
		}
	}

	public void chay(double quangDuongKm) {
		if (quangDuongKm <= 0) {
			return;
		}
		double xangCan = tinhXangCanCho(quangDuongKm);
		if (xangCan >= luongXang) {
			luongXang = 0;
		} else {
			luongXang -= xangCan;
		}
	}

	public boolean hetXang() {
		return luongXang <= 0;
	}

	public double layLuongXangConLai() {
		return luongXang;
	}

	protected abstract double tinhXangCanCho(double quangDuongKm);
}

class XeMay extends Xe {
	@Override
	protected double tinhXangCanCho(double quangDuongKm) {
		double xangCoBan = 2.0 * (quangDuongKm / 100.0);
		double xangThemDoHang = (khoiLuongHang / 10.0) * 0.1 * (quangDuongKm / 100.0);
		return xangCoBan + xangThemDoHang;
	}
}

class XeTai extends Xe {
	@Override
	protected double tinhXangCanCho(double quangDuongKm) {
		double xangCoBan = 20.0 * (quangDuongKm / 100.0);
		double xangThemDoHang = (khoiLuongHang / 100.0) * 1.0 * (quangDuongKm / 100.0);
		return xangCoBan + xangThemDoHang;
	}
}

public class bai4 {
	public static void main(String[] args) {
		XeMay xeMay = new XeMay();
		xeMay.doXang(5);
		xeMay.themHang(20);
		xeMay.chay(100);

		System.out.println("Xe may con xang: " + xeMay.layLuongXangConLai() + " lit");
		System.out.println("Xe may het xang? " + xeMay.hetXang());

		XeTai xeTai = new XeTai();
		xeTai.doXang(50);
		xeTai.themHang(300);
		xeTai.chay(150);
		xeTai.botHang(100);

		System.out.println("Xe tai con xang: " + xeTai.layLuongXangConLai() + " lit");
		System.out.println("Xe tai het xang? " + xeTai.hetXang());
	}
}
