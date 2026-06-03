package qlsp;

import java.sql.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;

public class SanPham extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(SanPham.class.getName());
    DefaultTableModel tblModelTT;
    SanPhamBUS bus = new SanPhamBUS();

    public SanPham() {
        initComponents();
        TaoTable();
    }

    public void TaoTable() {
        tblModelTT = new DefaultTableModel();
        String tieuDe[] = {"Mã sản phẩm", "Tên sản phẩm", "Giá"};
        tblModelTT.setColumnIdentifiers(tieuDe);
        for (String[] row : bus.layDanhSach()) {
            tblModelTT.addRow(row);
        }
        jTable1.setModel(tblModelTT);
    }

    @SuppressWarnings("unchecked")
    private void initComponents() {
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jLabel1.setText("Mã Sản Phẩm");
        jLabel2.setText("Tên Sản Phẩm");
        jLabel3.setText("Giá");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object[][] {},
            new String[]{"Mã SP", "Tên SP", "Giá"}
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Thêm");
        jButton1.addActionListener(this::jButton1ActionPerformed);
        jButton2.setText("Xóa");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        jButton3.setText("Sửa");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        jButton4.setText("Thoát");
        jButton4.addActionListener(this::jButton4ActionPerformed);

        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField1)
                            .addComponent(jTextField2)
                            .addComponent(jTextField3, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2)
                            .addGap(26, 26, 26)
                            .addComponent(jButton3)
                            .addGap(29, 29, 29)
                            .addComponent(jButton4))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(123, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        pack();
    }

    private void jTableMouseClicked(java.awt.event.MouseEvent evt) {
        int indexTB = jTable1.getSelectedRow();
        if (indexTB < tblModelTT.getRowCount() && indexTB >= 0) {
            jTextField1.setText(tblModelTT.getValueAt(indexTB, 0).toString());
            jTextField2.setText(tblModelTT.getValueAt(indexTB, 1).toString());
            jTextField3.setText(tblModelTT.getValueAt(indexTB, 2).toString());
        }
    }

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {
        boolean kq = bus.themSP(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
        if (kq) {
            String row[] = {jTextField1.getText(), jTextField2.getText(), jTextField3.getText()};
            tblModelTT.addRow(row);
            JOptionPane.showMessageDialog(this, "Thêm thành công!");
        } else {
            JOptionPane.showMessageDialog(this, "Thêm thất bại! Kiểm tra lại thông tin.");
        }
    }

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {
        int indexTB = jTable1.getSelectedRow();
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn xóa?", "Xóa dữ liệu", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            boolean kq = bus.xoaSP(jTextField1.getText());
            if (kq) {
                if (indexTB >= 0 && indexTB < tblModelTT.getRowCount())
                    tblModelTT.removeRow(indexTB);
            } else {
                JOptionPane.showMessageDialog(this, "Xóa thất bại!");
            }
        }
    }

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn sửa?", "Sửa dữ liệu", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION) {
            boolean kq = bus.suaSP(jTextField1.getText(), jTextField2.getText(), jTextField3.getText());
            if (kq) {
                int indexTB = jTable1.getSelectedRow();
                if (indexTB >= 0 && indexTB < tblModelTT.getRowCount()) {
                    tblModelTT.setValueAt(jTextField2.getText(), indexTB, 1);
                    tblModelTT.setValueAt(jTextField3.getText(), indexTB, 2);
                }
                JOptionPane.showMessageDialog(this, "Sửa thành công!");
            } else {
                JOptionPane.showMessageDialog(this, "Sửa thất bại!");
            }
        }
    }

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {
        int ret = JOptionPane.showConfirmDialog(null, "Bạn có muốn thoát?", "Thoát", JOptionPane.YES_NO_OPTION);
        if (ret == JOptionPane.YES_OPTION)
            System.exit(0);
    }

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> new SanPham().setVisible(true));
    }

    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
}