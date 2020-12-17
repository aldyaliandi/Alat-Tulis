/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.query;

import alattulis.connection.koneksiSQL;
import alattulis.model.modelBarang;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import alattulis.model.interfaces.interfaceBarang;

/**
 *
 * @author My PC
 */
public class queryBarang implements interfaceBarang{
     private Connection conn = koneksiSQL.getConnection();

    @Override
    public boolean insert(modelBarang k) {
      String sql = "INSERT INTO table_barang values (?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, k.getId_barang());
            statement.setString(2, k.getNama_barang());
            statement.setString(3, k.getKode_barang());
            statement.setInt(4, k.getHarga_barang());
            statement.setInt(5, k.getStok_barang());
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}
    

    @Override
    public boolean update(modelBarang b) {
        String sql = "UPDATE table_barang SET nama_barang=?,"
                + " kode_barang=?, harga_barang=?, stok_barang=?"
                + " WHERE id_barang=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, b.getNama_barang());
            statement.setString(2, b.getKode_barang());
            statement.setInt(3, b.getHarga_barang());
            statement.setInt(4, b.getStok_barang());
            statement.setInt(5, b.getId_barang());
         
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    @Override
    public boolean delete(int id_barang) {
         String sql = "DELETE FROM table_barang where id_barang=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setInt(1, id_barang);
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }
    

    @Override
    public int generateIDbarang() {
        int nik = 0;
        String sql = "EXEC generateIDbarang";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                nik = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nik;
    }

    @Override
    public List<modelBarang> getAllBarang() {
        List<modelBarang> listBarang = new ArrayList<>();
        String sql = "SELECT * FROM table_barang";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelBarang b = new modelBarang(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5)
                    );
                    listBarang.add(b);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBarang;   
    }

    @Override
    public modelBarang getOneBarangByID(int id_barang) {
         modelBarang output = null;
        String sql = "Select * from table_barang where id_barang=?";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, id_barang);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new modelBarang(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5)
                    );
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    @Override
    public List<modelBarang> getAllBarangByName(String nama_barang) {
           List<modelBarang> listBarang = new ArrayList<>();
        String sql = "Select * from table_barang WHERE nama_barang like '%"+nama_barang+"%'";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelBarang b = new modelBarang(
                            rs.getInt(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getInt(4),
                            rs.getInt(5)
                    );
                    listBarang.add(b);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelBarang.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listBarang;
}
}
