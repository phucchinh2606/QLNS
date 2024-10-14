/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Model;

import com.mycompany.Connection.DBconnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Admin
 */
public class QuanLyBaoHiemModel {
    public List<Object[]> danhBaoHiem() {
    Connection conn = null;
    List<Object[]> listBaoHiem = new ArrayList<>();
    try {
         conn = new DBconnection().getConnection();  
        if (conn != null) {
            String query = "SELECT Username, Password, MaNV FROM TaiKhoan";
            PreparedStatement stmt = conn.prepareStatement(query);  
            ResultSet rs = stmt.executeQuery();  
            
            // Lặp qua từng kết quả
            while (rs.next()) {
                Object[] row = new Object[]{
                                     
                };
                listBaoHiem.add(row);  // Thêm mỗi hàng vào danh sách
            }
        }
    } catch (Exception e) {
        e.printStackTrace(); 
    } finally {
        if (conn != null) {
            try {
                conn.close();  
            } catch (Exception e) {
                e.printStackTrace();  
            }
        }
    }
    return listBaoHiem;  
}
}
