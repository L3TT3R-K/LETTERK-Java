package Lab02.BaiTapVeNha.BTVNCau2;
import java.util.ArrayList;


public class QuanLySieuThi {
    private ArrayList<HangHoa> danhSachHangHoa;

    public QuanLySieuThi() {
        this.danhSachHangHoa = new ArrayList<>();
    }

    public boolean themHangHoa(HangHoa hangHoaMoi) {
        for (HangHoa h : danhSachHangHoa) {
            if (h.getMaHang().equalsIgnoreCase(hangHoaMoi.getMaHang())) {
                System.out.println("Lỗi: Mã hàng " + hangHoaMoi.getMaHang() + " đã tồn tại!");
                return false;
            }
        }
        danhSachHangHoa.add(hangHoaMoi);
        return true;
    }

    public void xuatMucDoDanhGiaTatCa() {
        System.out.println("\n--- ĐÁNH GIÁ MỨC ĐỘ BÁN BUÔN ---");
        for (HangHoa h : danhSachHangHoa) {
            System.out.printf("Mã: %-5s | Tên: %-15s | Tồn: %-3d | Đánh giá: %s\n", 
                              h.getMaHang(), h.getTenHang(), h.getSoLuongTon(), h.danhGiaMucDoBan());
        }
    }

    public void inThuongHieuDienMayBanDuoc() {
        System.out.println("\n--- CÁC SẢN PHẨM ĐIỆN MÁY 'BÁN ĐƯỢC' ---");
        for (HangHoa h : danhSachHangHoa) {
            if (h instanceof HangDienMay && "Bán được".equals(h.danhGiaMucDoBan())) {
                HangDienMay hdm = (HangDienMay) h;
                System.out.printf("Thương hiệu: %-10s | Loại: %-10s | Tên: %s\n", 
                                  hdm.getThuongHieu(), hdm.getLoaiMay(), hdm.getTenHang());
            }
        }
    }
    
    public void inDanhSach() {
        System.out.println("\n--- DANH SÁCH HÀNG HÓA ---");
        for (HangHoa h : danhSachHangHoa) {
            h.inThongTin();
        }
    }
}
