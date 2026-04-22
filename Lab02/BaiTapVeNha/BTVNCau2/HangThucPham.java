package hangthucpham;
import java.time.LocalDate;
import hanghoa.HangHoa;

public class HangThucPham extends HangHoa {
    private static final double THUE_VAT = 0.05;

    private LocalDate ngaySanXuat;
    private LocalDate ngayHetHan;
    private String nhaCungCap;

    public HangThucPham() {}

    public HangThucPham(String maHang, String tenHang, int soLuongTon, double donGia,
                        LocalDate ngaySanXuat, LocalDate ngayHetHan, String nhaCungCap) {
        super(maHang, tenHang, soLuongTon, donGia);
        this.ngaySanXuat = ngaySanXuat;
        this.ngayHetHan = ngayHetHan.isBefore(ngaySanXuat) ? ngaySanXuat : ngayHetHan;
        this.nhaCungCap = nhaCungCap;
    }

    @Override
    protected double getTyLeVat() { 
    	return THUE_VAT; 
    }

    @Override
    public String danhGiaMucDoBan() {
        LocalDate homNay = LocalDate.now();
        if (ngayHetHan.isBefore(homNay) && soLuongTon > 2) {
            return "Khó bán";
        }
        return "Không đánh giá";
    }

    @Override
    public void inThongTin() {
        System.out.printf("[Thực Phẩm] Mã: %s | Tên: %s | Tồn: %d | Đơn giá: %,.0f | Hết hạn: %s\n", 
                          maHang, tenHang, soLuongTon, donGia, ngayHetHan);
    }
}
