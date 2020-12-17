/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.controller;

import alattulis.model.modelKaryawan;
import alattulis.model.query.queryKaryawan;
import java.util.List;

/**
 *
 * @author My PC
 */
public class controllerKaryawan {
    private queryKaryawan queryKaryawan = new queryKaryawan();
    
    public List<modelKaryawan> getAllData(){
        return queryKaryawan.getAllKaryawan();
    }
    
    public List<modelKaryawan> getAllKaryawanByName(String nama_karyawan){
        return queryKaryawan.getAllKaryawanByName(nama_karyawan);
    }
    
    public boolean insertKaryawan(modelKaryawan data){
        return queryKaryawan.insert(data);
    }
    
    public boolean updateKaryawan(modelKaryawan data){
        return queryKaryawan.update(data);
    }
    
    public boolean deleteKaryawan(String nik){
        return queryKaryawan.delete(nik);
    }
}
