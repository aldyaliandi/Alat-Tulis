/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.reports;

import alattulis.connection.koneksiSQL;
import java.sql.Connection;
import java.util.logging.Level;
import java.util.logging.Logger;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;


/**
 *
 * @author My PC
 */
public class GenerateReport {
    
    private Connection conn = koneksiSQL.getConnection();
    
    public void GenerateReportAlatTulis(){
        try{
            String sql = "select * from table_transaksi";
            JasperDesign jd = JRXmlLoader.load("src/alattulis/reports/reportAlatTulis.jrxml");
            JRDesignQuery query = new JRDesignQuery();
            query.setText(sql);
            jd.setQuery(query);
            JasperReport report = JasperCompileManager.compileReport(jd);
            JasperPrint print = JasperFillManager.fillReport(report, null, conn);
            JasperViewer.viewReport(print);
            
        } catch (JRException ex) {
            Logger.getLogger(GenerateReport.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
