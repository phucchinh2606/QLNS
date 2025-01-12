/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package com.mycompany.View;

import com.mycompany.Controller.QuanLyHoSoController;
import java.util.Date;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class pQuanLyHoSoNV extends javax.swing.JPanel {

    /**
     * Creates new form pQuanLyHoSoNV
     */
    public pQuanLyHoSoNV() {
        initComponents();
        QuanLyHoSoController quanLyHoSoController = new QuanLyHoSoController(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton_timkiem = new javax.swing.JButton();
        jTextField_SearchNV = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_NV = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField_MNV = new javax.swing.JTextField();
        jTextField_TenNV = new javax.swing.JTextField();
        jTextField_Sex = new javax.swing.JTextField();
        jTextField_QueQuan = new javax.swing.JTextField();
        jTextField_SDT = new javax.swing.JTextField();
        jTextField_TDHV = new javax.swing.JTextField();
        jDateChooser_NgaySinh = new com.toedter.calendar.JDateChooser();
        jButton_ThemNV = new javax.swing.JButton();
        jButton_SuaNV = new javax.swing.JButton();
        jButton_XoaNV = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("QUẢN LÝ HỒ SƠ NHÂN VIÊN");
        jLabel1.setToolTipText("");

        jLabel2.setText("Tìm kiếm nhân viên :");

        jButton_timkiem.setText("Tìm Kiếm");

        jTable_NV.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jTable_NV.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_NVMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_NV);

        jLabel3.setText("Mã nhân viên :");

        jLabel4.setText("Quê quán :");

        jLabel5.setText("Tên nhân viên :");

        jLabel6.setText("Giới tính :");

        jLabel7.setText("Ngày sinh :");

        jLabel8.setText("Số điện thoại :");

        jLabel9.setText("Trình độ học vấn :");

        jButton_ThemNV.setText("Thêm");

        jButton_SuaNV.setText("Sửa");

        jButton_XoaNV.setText("Xóa");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addGap(16, 16, 16))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(36, 36, 36)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jDateChooser_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel8))
                                        .addGap(37, 37, 37)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField_SDT, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jButton_ThemNV))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jButton_SuaNV)
                                                .addGap(38, 38, 38)
                                                .addComponent(jButton_XoaNV))
                                            .addComponent(jTextField_TDHV, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(32, 32, 32)
                                .addComponent(jTextField_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(59, 59, 59)
                                .addComponent(jButton_timkiem)))
                        .addGap(150, 150, 150))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(233, 233, 233))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_SearchNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jButton_timkiem))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField_MNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_QueQuan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField_SDT, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTextField_TenNV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jTextField_TDHV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_Sex, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton_ThemNV)
                        .addComponent(jButton_SuaNV)
                        .addComponent(jButton_XoaNV))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jDateChooser_NgaySinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel7)))
                .addGap(0, 43, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jTable_NVMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_NVMouseClicked
        // Lấy hàng được chọn
    int selectedRow = jTable_NV.getSelectedRow(); 
    if (selectedRow >= 0) {
        // Lấy giá trị của các cột từ hàng được chọn
        String maNV = jTable_NV.getValueAt(selectedRow, 0).toString(); 
        String tenNV = jTable_NV.getValueAt(selectedRow, 1).toString(); 
        String gioiTinh = jTable_NV.getValueAt(selectedRow, 2).toString(); 
        String ngaySinh = jTable_NV.getValueAt(selectedRow, 3).toString(); 
        String queQuan = jTable_NV.getValueAt(selectedRow, 4).toString(); 
        String sdt = jTable_NV.getValueAt(selectedRow, 5).toString(); 
        String tdHv = jTable_NV.getValueAt(selectedRow, 6).toString(); 

        // Đặt giá trị vào các JTextField tương ứng
        jTextField_MNV.setText(maNV);
        jTextField_TenNV.setText(tenNV);
        jTextField_Sex.setText(gioiTinh);
        jDateChooser_NgaySinh.setDate(java.sql.Date.valueOf(ngaySinh)); // Ngày sinh phải chuyển đổi sang định dạng java.sql.Date
        jTextField_QueQuan.setText(queQuan);
        jTextField_SDT.setText(sdt);
        jTextField_TDHV.setText(tdHv);
    }
    }//GEN-LAST:event_jTable_NVMouseClicked

    public JButton getjButton_timkiem() {
        return jButton_timkiem;
    }

    public JButton getjButton_SuaNV() {
        return jButton_SuaNV;
    }

    public JButton getjButton_ThemNV() {
        return jButton_ThemNV;
    }

    public JButton getjButton_XoaNV() {
        return jButton_XoaNV;
    }

    public JTable getjTable_NV() {
        return jTable_NV;
    }
    // jTextField_SearchNV
    public void setSearchNV(String value) {
        jTextField_SearchNV.setText(value);
    }

    public String getSearchNV() {
        return jTextField_SearchNV.getText().trim();
    }

    // jTextField_MNV
    public void setMNV(String value) {
        jTextField_MNV.setText(value);
    }

    public String getMNV() {
        return jTextField_MNV.getText().trim();
    }

    // jTextField_TenNV
    public void setTenNV(String value) {
        jTextField_TenNV.setText(value);
    }

    public String getTenNV() {
        return jTextField_TenNV.getText().trim();
    }

    // jTextField_Sex
    public void setSex(String value) {
        jTextField_Sex.setText(value);
    }

    public String getSex() {
        return jTextField_Sex.getText().trim();
    }

    // jDateChooser_NgaySinh
    public void setNgaySinh(Date value) {
        jDateChooser_NgaySinh.setDate(value);
    }

    public Date getNgaySinh() {
        java.util.Date utilDate = jDateChooser_NgaySinh.getDate();
        return new Date(utilDate.getTime());
    }

    // jTextField_QueQuan
    public void setQueQuan(String value) {
        jTextField_QueQuan.setText(value);
    }

    public String getQueQuan() {
        return jTextField_QueQuan.getText().trim();
    }

    // jTextField_SDT
    public void setSDT(String value) {
        jTextField_SDT.setText(value);
    }

    public String getSDT() {
        return jTextField_SDT.getText().trim();
    }

    // jTextField_TDHV
    public void setTDHV(String value) {
        jTextField_TDHV.setText(value);
    }

    public String getTDHV() {
        return jTextField_TDHV.getText().trim();
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_SuaNV;
    private javax.swing.JButton jButton_ThemNV;
    private javax.swing.JButton jButton_XoaNV;
    private javax.swing.JButton jButton_timkiem;
    private com.toedter.calendar.JDateChooser jDateChooser_NgaySinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_NV;
    private javax.swing.JTextField jTextField_MNV;
    private javax.swing.JTextField jTextField_QueQuan;
    private javax.swing.JTextField jTextField_SDT;
    private javax.swing.JTextField jTextField_SearchNV;
    private javax.swing.JTextField jTextField_Sex;
    private javax.swing.JTextField jTextField_TDHV;
    private javax.swing.JTextField jTextField_TenNV;
    // End of variables declaration//GEN-END:variables
}
