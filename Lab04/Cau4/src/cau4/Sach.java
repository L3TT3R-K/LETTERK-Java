/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau4;


public class Sach implements java.io.Serializable {
    private final String maSach; // Không cho phép sửa sau khi tạo
    private String tenSach, tacGia, nhaXuatBan;
    private double gia;

    public Sach(String maSach, String tenSach, String tacGia, String nhaXuatBan, double gia) {
        this.maSach = maSach;
        this.tenSach = tenSach;
        this.tacGia = tacGia;
        this.nhaXuatBan = nhaXuatBan;
        this.gia = gia;
    }

    // Getters và Setters (riêng maSach chỉ có Getter)
    public String getMaSach() { return maSach; }
    public String getTenSach() { return tenSach; }
    public void setTenSach(String tenSach) { this.tenSach = tenSach; }
    public String getTacGia() { return tacGia; }
    public void setTacGia(String tacGia) { this.tacGia = tacGia; }
    public String getNhaXuatBan() { return nhaXuatBan; }
    public void setNhaXuatBan(String nhaXuatBan) { this.nhaXuatBan = nhaXuatBan; }
    public double getGia() { return gia; }
    public void setGia(double gia) { this.gia = gia; }
}