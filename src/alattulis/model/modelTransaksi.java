/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alattulis.model;

/**
 *
 * @author My PC
 */

public class modelTransaksi {
    private String id_transaksi;
    private int id_karyawan;
    private int id_barang;
    private String kode_barang;
    private String tanggal_transaksi;
    private int sub_total;
    private int jumlah_bayar;
    
    public modelTransaksi(String id_transaksi,int id_karyawan, 
            int id_barang, String kode_barang, String tanggal_transaksi,
            int sub_total,
            int jumlah_bayar){
        this.id_transaksi = id_transaksi;
        this.id_karyawan = id_karyawan;
        this.id_barang = id_barang;
        this.kode_barang = kode_barang;
        this.tanggal_transaksi = tanggal_transaksi;
        this.sub_total = sub_total;
        this.jumlah_bayar = jumlah_bayar;
    }

    /**
     * @return the id_transaksi
     */
    public String getId_transaksi() {
        return id_transaksi;
    }

    /**
     * @param id_transaksi the id_transaksi to set
     */
    public void setId_transaksi(String id_transaksi) {
        this.id_transaksi = id_transaksi;
    }

    /**
     * @return the id_karyawan
     */
    public int getId_karyawan() {
        return id_karyawan;
    }

    /**
     * @param id_karyawan the id_karyawan to set
     */
    public void setId_karyawan(int id_karyawan) {
        this.id_karyawan = id_karyawan;
    }

    /**
     * @return the id_barang
     */
    public int getId_barang() {
        return id_barang;
    }

    /**
     * @param id_barang the id_barang to set
     */
    public void setId_barang(int id_barang) {
        this.id_barang = id_barang;
    }

    /**
     * @return the kode_barang
     */
    public String getKode_barang() {
        return kode_barang;
    }

    /**
     * @param kode_barang the kode_barang to set
     */
    public void setKode_barang(String kode_barang) {
        this.kode_barang = kode_barang;
    }

    /**
     * @return the tanggal_transaksi
     */
    public String getTanggal_transaksi() {
        return tanggal_transaksi;
    }

    /**
     * @param tanggal_transaksi the tanggal_transaksi to set
     */
    public void setTanggal_transaksi(String tanggal_transaksi) {
        this.tanggal_transaksi = tanggal_transaksi;
    }

    /**
     * @return the sub_total
     */
    public int getSub_total() {
        return sub_total;
    }

    /**
     * @param sub_total the sub_total to set
     */
    public void setSub_total(int sub_total) {
        this.sub_total = sub_total;
    }

    /**
     * @return the jumlah_bayar
     */
    public int getJumlah_bayar() {
        return jumlah_bayar;
    }

    /**
     * @param jumlah_bayar the jumlah_bayar to set
     */
    public void setJumlah_bayar(int jumlah_bayar) {
        this.jumlah_bayar = jumlah_bayar;
    }
}


