/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.interfaces;

import java.util.List;
import alattulis.model.modelBarang;



/**
 *
 * @author My PC
 */
public interface interfaceBarang {
    
    public boolean insert(modelBarang data);
    public boolean update(modelBarang data);
    public boolean delete(int id_barang);
    
    public int generateIDbarang();
    
    public List<modelBarang> getAllBarang();
    
    public modelBarang getOneBarangByID(int id_barang);
    
    public List<modelBarang> getAllBarangByName(String nama_barang);
}
