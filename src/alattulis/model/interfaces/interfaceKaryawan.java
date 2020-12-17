/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model.interfaces;

import java.util.List;
import alattulis.model.modelKaryawan;

/**
 *
 * @author My PC
 */
public interface interfaceKaryawan {
    public boolean insert(modelKaryawan data);
    public boolean update(modelKaryawan data);
    public boolean delete(String nik);
    
    public List<modelKaryawan> getAllKaryawan();
    
    public modelKaryawan getOneKaryawanByID(String nik);
    
    public List<modelKaryawan> getAllKaryawanByName(String nama_karyawan);
}
