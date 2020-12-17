/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.interfaces;

import alattulis.model.modelTransaksi;
import java.util.List;

/**
 *
 * @author My PC
 */
public interface interfaceTransaksi {

    public boolean insert(modelTransaksi data);
    public boolean update(modelTransaksi data);
    public boolean delete(String id_transaksi);
    
    public int generateIDtransaksi();
    
    public List<modelTransaksi> getAllTransaksi();
    
    public modelTransaksi getOneTransaksiByID(int id_transaksi);
    
    public List<modelTransaksi> getAllTransaksiByName(String kode_barang);
}

