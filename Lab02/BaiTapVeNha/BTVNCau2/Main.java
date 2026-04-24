package Lab02.BaiTapVeNha.BTVNCau2;
import java.time.LocalDate;


public class Main {
    public static void main(String[] args) {
        QuanLySieuThi quanLy = new QuanLySieuThi();

        System.out.println("====== KHỞI TẠO VÀ THÊM DỮ LIỆU MẪU ======");

        HangDienMay laptop = new HangDienMay("DM01", "Laptop Dell XPS", 2, 25000000, "Dell", "Laptop", 24);
        quanLy.themHangHoa(laptop);

        HangDienMay tivi = new HangDienMay("DM02", "Tivi Sony 4K", 10, 15000000, "Sony", "Tivi", 12);
        quanLy.themHangHoa(tivi);

        LocalDate hsdSua = LocalDate.now().minusDays(3);
        HangThucPham sua = new HangThucPham("TP01", "Sữa tươi Vinamilk", 5, 300000, LocalDate.now().minusMonths(6), hsdSua, "Vinamilk");
        quanLy.themHangHoa(sua);

        LocalDate ngayNhapNoi = LocalDate.now().minusDays(30);
        HangGiaDung noiCom = new HangGiaDung("GD01", "Nồi cơm điện X", 15, 800000, "Sunhouse", ngayNhapNoi, "Nồi");
        quanLy.themHangHoa(noiCom);

        quanLy.inDanhSach();
        quanLy.xuatMucDoDanhGiaTatCa();
        quanLy.inThuongHieuDienMayBanDuoc();

        System.out.println("\n--- KIỂM TRA CHỨC NĂNG BÁN HÀNG ---");
        System.out.printf("Khách mua 1 Laptop Dell (Đơn giá 25tr, VAT 10%%). Thành tiền: %,.0f VNĐ\n", laptop.tinhThanhTien(1));
        System.out.println("Số lượng tồn kho Laptop Dell sau khi bán: " + laptop.getSoLuongTon());
    }
}
