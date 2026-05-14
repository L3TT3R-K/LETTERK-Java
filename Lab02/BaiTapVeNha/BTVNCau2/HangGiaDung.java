package Lab02.BaiTapVeNha.BTVNCau2;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;


public class HangGiaDung extends HangHoa {
    private static final double THUE_VAT = 0.10;

    private String nhaSanXuat;
    private LocalDate ngayNhapSieuThi;
    private String loaiGiaDung;

    public HangGiaDung() {}

    public HangGiaDung(String maHang, String tenHang, int soLuongTon, double donGia,
                       String nhaSanXuat, LocalDate ngayNhapSieuThi, String loaiGiaDung) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.nhaSanXuat = nhaSanXuat;
        this.ngayNhapSieuThi = ngayNhapSieuThi;
        this.loaiGiaDung = loaiGiaDung;
    }

    @Override
    protected double getTyLeVat() { 
    	return THUE_VAT; 
    }

    @Override
    public String danhGiaMucDoBan() {
        LocalDate homNay = LocalDate.now();
        long soNgayLuuKho = ChronoUnit.DAYS.between(ngayNhapSieuThi, homNay);
        if (soLuongTon > 10 && soNgayLuuKho > 20) {
            return "Bán chậm";
        }
        return "Không đánh giá";
    }

    @Override
    public void inThongTin() {
        System.out.printf("[Gia Dụng] Mã: %s | Tên: %s | Tồn: %d | Đơn giá: %,.0f | Ngày nhập: %s\n", 
                          maHang, tenHang, soLuongTon, donGia, ngayNhapSieuThi);
    }
}
