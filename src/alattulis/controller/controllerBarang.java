
package alattulis.controller;

import alattulis.model.query.queryBarang;
import alattulis.model.modelBarang;
import java.util.List;

/**
 *
 * @author My PC
 */
public class controllerBarang {
    private queryBarang queryBarang = new  queryBarang();
    
    public List<modelBarang> getAllData() {
        return queryBarang.getAllBarang();
    }
    
    public List<modelBarang> getAllBarangByName(String nama_barang) {
        return queryBarang.getAllBarangByName(nama_barang);
    }
    
    public boolean insertBarang(modelBarang data){
        return queryBarang.insert(data);
    }
    
    public boolean updateBarang(modelBarang data){
        return queryBarang.update(data);
    }
    
    public boolean deleteBarang(int id){
        return queryBarang.delete(id);
    }
    
    public int generateIDbarang(){
        return queryBarang.generateIDbarang();
    }     
    }
