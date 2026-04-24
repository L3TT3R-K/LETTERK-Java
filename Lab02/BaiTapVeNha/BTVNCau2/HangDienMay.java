package Lab02.BaiTapVeNha.BTVNCau2;

public class HangDienMay extends HangHoa {
    private static final double THUE_VAT = 0.10; 
    
    private String thuongHieu;
    private String loaiMay;
    private int thoiGianBaoHanhThang;

    public HangDienMay() {}

    public HangDienMay(String maHang, String tenHang, int soLuongTon, double donGia,
                       String thuongHieu, String loaiMay, int thoiGianBaoHanhThang) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.thuongHieu = thuongHieu;
        this.loaiMay = loaiMay;
        this.thoiGianBaoHanhThang = thoiGianBaoHanhThang;
    }

    public String getThuongHieu() { 
    	return thuongHieu; 
    }
    
    public String getLoaiMay() { return loaiMay; }

    @Override
    protected double getTyLeVat() { 
    	return THUE_VAT; 
    }

    @Override
    public String danhGiaMucDoBan() {
        if (this.soLuongTon < 3) {
            return "Bán được";
        }
        return "Không đánh giá";
    }

    @Override
    public void inThongTin() {
        System.out.printf("[Điện Máy] Mã: %s | Tên: %s | Tồn: %d | Đơn giá: %,.0f | Thương hiệu: %s\n", 
                          maHang, tenHang, soLuongTon, donGia, thuongHieu);
    }
}
