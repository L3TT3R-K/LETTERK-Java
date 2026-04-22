package hanghoa;

public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected int soLuongTon;
    protected double donGia;

    public HangHoa() {}

    public HangHoa(String maHang, String tenHang, int soLuongTon, double donGia) {
        this.maHang = maHang;
        this.tenHang = tenHang;
        this.soLuongTon = soLuongTon;
        this.donGia = donGia;
    }

    public String getMaHang() { 
    	return maHang; 
    }
    
    public String getTenHang() { 
    	return tenHang; 
    }
    
    public int getSoLuongTon() { 
    	return soLuongTon; 
    }
    
    public void setSoLuongTon(int soLuongTon) { 
    	this.soLuongTon = soLuongTon; 
    }

    public double tinhThanhTien(int soLuongMua) {
        if (soLuongMua <= soLuongTon) {
            this.soLuongTon -= soLuongMua;
            double tienTruocThue = soLuongMua * donGia;
            return tienTruocThue + (tienTruocThue * getTyLeVat()); 
        }
        System.out.println("Lỗi: Số lượng tồn kho không đủ để bán!");
        return 0;
    }

    public abstract void inThongTin();
    public abstract String danhGiaMucDoBan();
    protected abstract double getTyLeVat();
}