/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsp;
import java.util.ArrayList;
/**
 *
 * @author AndyKien
 */
public class SanPhamBUS {
    SanPhamDAO dao = new SanPhamDAO();

    public ArrayList<String[]> layDanhSach() {
        return dao.layDanhSach();
    }

    public boolean themSP(String maSP, String tenSP, String gia) {
        if (maSP.isEmpty() || tenSP.isEmpty() || gia.isEmpty()) {
            return false;
        }
        try {
            long giaSP = Long.parseLong(gia);
            return dao.themSP(maSP, tenSP, giaSP);
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public boolean xoaSP(String maSP) {
        if (maSP.isEmpty()) return false;
        return dao.xoaSP(maSP);
    }

    public boolean suaSP(String maSP, String tenSP, String gia) {
        if (maSP.isEmpty() || tenSP.isEmpty() || gia.isEmpty()) {
            return false;
        }
        try {
            long giaSP = Long.parseLong(gia);
            return dao.suaSP(maSP, tenSP, giaSP);
        } catch (NumberFormatException e) {
            return false;
        }
    }
}

