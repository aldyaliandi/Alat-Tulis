/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis;

import alattulis.connection.koneksiSQL;
import java.sql.Connection;

/**
 *
 * @author My PC
 */
public class AlatTulis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Connection sql = koneksiSQL.getConnection();
    }
    
}
