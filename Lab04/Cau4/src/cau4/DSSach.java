/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package cau4;

/**
 *
 * @author LENOVO
 */
import java.util.ArrayList;

public class DSSach {
    private ArrayList<Sach> ds;

    public DSSach() {
        ds = new ArrayList<>();
    }

    public boolean themSach(Sach s) {
        // Kiểm tra trùng mã
        for (Sach item : ds) {
            if (item.getMaSach().equalsIgnoreCase(s.getMaSach())) return false;
        }
        ds.add(s);
        return true;
    }

    public boolean xoaSach(String ma) {
        return ds.removeIf(s -> s.getMaSach().equalsIgnoreCase(ma));
    }

    public Sach timSach(String ma) {
        for (Sach s : ds) {
            if (s.getMaSach().equalsIgnoreCase(ma)) return s;
        }
        return null;
    }
    
    public ArrayList<Sach> getDs() { return ds; }
    
    public boolean capNhat(String ma, Sach sMoi) {
    for (int i = 0; i < ds.size(); i++) {
        if (ds.get(i).getMaSach().equalsIgnoreCase(ma)) {
            ds.set(i, sMoi); // Thay thế đối tượng cũ bằng đối tượng mới
            return true;
        }
    }
    return false;
   }
    public void setDs(ArrayList<Sach> ds) {
    this.ds = ds;
    }
}