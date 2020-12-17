/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.controller;

import alattulis.model.modelTransaksi;
import alattulis.model.query.queryTransaksi;
import java.util.List;


/**
 *
 * @author My PC
 */
public class controllerTransaksi {
    private queryTransaksi queryTransaksi = new  queryTransaksi();
    
    public List<modelTransaksi> getAllData() {
        return queryTransaksi.getAllTransaksi();
    }
    
    public boolean insertmodelTransaksi(modelTransaksi data){
        return queryTransaksi.insert(data);
    }
    
    public boolean updatemodelTransaksi(modelTransaksi data){
        return queryTransaksi.update(data);
    }
    
    public boolean deleteHeadService(String id_transaksi){
        return queryTransaksi.delete(id_transaksi);
    }
    
    public int generateIDtransaksi(){
        return queryTransaksi.generateIDtransaksi();
    }
}
