/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import main.config.DBConnect;
import main.entity.DongSanPham;

/**
 *
 * @author hangnt
 */
public class DongSanPhamRepository {

    public ArrayList<DongSanPham> getAll() {
        String sql = """
                 SELECT ds.Id ,ds.Ma ,ds.Ten
                      FROM  DongSP ds
                     """;
        ArrayList<DongSanPham> lists = new ArrayList<>();
        try (Connection con = DBConnect.getConnection();
                PreparedStatement ps = con.prepareStatement(sql)) {
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                lists.add(new DongSanPham(
                        rs.getInt(1), rs.getString(2),
                        rs.getString(3)
                ));
            }
        } catch (Exception e) {
            e.printStackTrace(System.out); // nem loi khi xay ra 
        }
        return lists;
    }
}
