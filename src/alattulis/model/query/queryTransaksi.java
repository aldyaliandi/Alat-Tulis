
package alattulis.model.query;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import alattulis.connection.koneksiSQL;
import alattulis.model.modelTransaksi;
import alattulis.model.interfaces.interfaceTransaksi;

/**
 *
 * @author My PC
 */
public class queryTransaksi implements interfaceTransaksi{
    private Connection conn = koneksiSQL.getConnection();
    @Override
    public boolean insert(modelTransaksi p) {
        String sql = "INSERT INTO table_transaksi values (?,?,?,?,?,?,?)";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, p.getId_transaksi());
            statement.setInt(2, p.getId_karyawan());
            statement.setInt(3, p.getId_barang());
            statement.setString(4, p.getKode_barang());
            statement.setString(5, p.getTanggal_transaksi());
            statement.setInt(6, p.getSub_total());
            statement.setInt(7, p.getJumlah_bayar());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean update(modelTransaksi p) {
        String sql = "UPDATE tabel_transaksi"
                + "SET  kode_narang=?, tanggal_transaksi=?, sub_total=?, jumlah_bayar=? "
                + "WHERE id_transaksi=? AND id_karyawan=? AND id_barang=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            
            statement.setString(1, p.getKode_barang());
            statement.setString(2, p.getTanggal_transaksi());
            statement.setInt(3, p.getSub_total());
            statement.setInt(4, p.getJumlah_bayar());
            statement.setString(5, p.getId_transaksi());
            statement.setInt(6, p.getId_karyawan());
            statement.setInt(7, p.getId_barang());
            
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public boolean delete(String id_transaksi) {
        String sql = "DELETE FROM tabel_transaksi "
                + "where id_transaksi=?";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            statement.setString(1, id_transaksi);
            int row = statement.executeUpdate();
            if (row > 0) {
                return true;
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return false;
    }

    @Override
    public List<modelTransaksi> getAllTransaksi() {
        List<modelTransaksi> listTransaksi = new ArrayList<>();
        String sql = "Select * from tabel_transaksi";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);

                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelTransaksi t = new modelTransaksi(
                            rs.getString(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                    listTransaksi.add(t);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listTransaksi;   

    }

    @Override
    public modelTransaksi getOneTransaksiByID(int nik) {
        modelTransaksi output = null;
        String sql = "Select * from tabel_transaksi where nik=?";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setInt(1, nik);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    output = new modelTransaksi(
                            rs.getString(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return output;
    }

    @Override
    public List<modelTransaksi> getAllTransaksiByName(String nama_karyawan) {
    List<modelTransaksi> listmodelTransaksi = new ArrayList<>();
        String sql = "Select a.*,b.nama_karyawan "
                + "from tabel_karyawan a "
                + "JOIN table_transaksi b "
                + "ON a.kode_barang = b.kode_barang "
                + "WHERE b.nama_karyawan like %?%";
        try {
            if (koneksiSQL.getConnection()==null){
                return null;
            }else{
                PreparedStatement statement = conn.prepareStatement(sql);
                statement.setString(1, nama_karyawan);
                
                ResultSet rs = statement.executeQuery();
                while (rs.next()){
                    modelTransaksi t = new modelTransaksi(
                            rs.getString(1),
                            rs.getInt(2),
                            rs.getInt(3),
                            rs.getString(4),
                            rs.getString(5),
                            rs.getInt(6),
                            rs.getInt(7)
                    );
                    
                    listmodelTransaksi.add(t);
                }
                statement.close();
            }
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listmodelTransaksi;
    }

    @Override
    public int generateIDtransaksi() {
        int id_transaksi = 0;
        String sql = "EXEC generateIDtransaksi";
        try {
            PreparedStatement statement = conn.prepareStatement(sql);
            
            ResultSet rs = statement.executeQuery();
            while (rs.next()){
                id_transaksi = rs.getInt(1);
            }
            statement.close();
        } catch (SQLException ex) {
            Logger.getLogger(modelTransaksi.class.getName()).log(Level.SEVERE, null, ex);
        }
        return id_transaksi;
    }
    
}
