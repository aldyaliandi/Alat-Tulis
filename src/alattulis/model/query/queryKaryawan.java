/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.query;

import alattulis.connection.koneksiSQL;
import alattulis.model.interfaces.interfaceKaryawan;
import alattulis.model.modelKaryawan;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author My PC
 */
public class queryKaryawan implements interfaceKaryawan{
    private Connection conn = koneksiSQL.getConnection();

    @Override
    public boolean insert(modelKaryawan k) {
        String sql = "INSERT INTO table_karyawan values (?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            
            
            statement.setString(1, k.getNik());
            statement.setString(2, k.getNama_karyawan());
            statement.setString(3, k.getLahir_karyawan());
            statement.setString(4, k.getKelamin_karyawan());
            statement.setString(5, k.getAlamat_karyawan());
            statement.setString(6, k.getEmail_karyawan());
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public boolean update(modelKaryawan k) {
        String sql = "UPDATE table_karyawan SET nama_karyawan=?,"
                + "lahir_karyawan=?,kelamin_karyawan=?, alamat_karyawan=?, email_karyawan=?,"
                + " WHERE nik=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, k.getNik());
            statement.setString(2, k.getNama_karyawan());
            statement.setString(3, k.getLahir_karyawan());
            statement.setString(4, k.getKelamin_karyawan());
            statement.setString(5, k.getAlamat_karyawan());
            statement.setString(6, k.getEmail_karyawan());
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;}

    @Override
    public boolean delete(String nik) {
        String sql = "DELETE FROM table_karyawan where nik=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, nik);
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<modelKaryawan> getAllKaryawan() {
    List<modelKaryawan> listKaryawan = new ArrayList<>();
        String sql = "SELECT * FROM table_karyawan";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelKaryawan k = new modelKaryawan(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    listKaryawan.add(k);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKaryawan;    
    }

    @Override
    public modelKaryawan getOneKaryawanByID(String nik) {
        modelKaryawan output = null;
        String sql = "Select * from table_karyawan where id_karyawan=?";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, nik);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new modelKaryawan(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    @Override
    public List<modelKaryawan> getAllKaryawanByName(String nama_karyawan) {
        List<modelKaryawan> listKaryawan = new ArrayList<>();
        String sql = "Select * from table_karyawan WHERE nama_karyawan like '%"+nama_karyawan+"%'";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelKaryawan s = new modelKaryawan(
                            rs.getString(1),
                            rs.getString(2),
                            rs.getString(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getString(6)
                    );
                    listKaryawan.add(s);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelKaryawan.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listKaryawan;
    }
    
    
}
