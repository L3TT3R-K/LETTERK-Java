/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package qlsp;
import java.sql.*;
import java.util.ArrayList;
/**
 *
 * @author AndyKien
 */
public class SanPhamDAO {
    public ArrayList<String[]> layDanhSach() {
        ArrayList<String[]> danhSach = new ArrayList<>();
            Connection con = new ConnectDB().createCon();
            try {
                String sql = "SELECT * FROM SANPHAM";
                Statement stat = con.createStatement();
                ResultSet rs = stat.executeQuery(sql);
                while (rs.next()) {
                    String[] row = new String[3];
                    row[0] = rs.getString(1);
                    row[1] = rs.getString(2);
                    row[2] = rs.getString(3);
                    danhSach.add(row);
                }
                con.close();
            } catch (SQLException e) {
                System.out.println(e);
            }
    return danhSach;
}
public boolean themSP(String maSP, String tenSP, long gia) {
        Connection con = new ConnectDB().createCon();
        String sql = "INSERT INTO SANPHAM VALUES(?,?,?)";
        try {
            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, maSP);
            pres.setString(2, tenSP);
            pres.setLong(3, gia);
            pres.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean xoaSP(String maSP) {
        Connection con = new ConnectDB().createCon();
        String sql = "DELETE FROM SANPHAM WHERE MASP = ?";
        try {
            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, maSP);
            pres.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }

    public boolean suaSP(String maSP, String tenSP, long gia) {
        Connection con = new ConnectDB().createCon();
        String sql = "UPDATE SANPHAM SET TENSP = ?, GIA = ? WHERE MASP = ?";
        try {
            PreparedStatement pres = con.prepareStatement(sql);
            pres.setString(1, tenSP);
            pres.setLong(2, gia);
            pres.setString(3, maSP);
            pres.executeUpdate();
            con.close();
            return true;
        } catch (SQLException e) {
            System.out.println(e);
            return false;
        }
    }
}