
package alattulis.model;

/**
 *
 * @author My PC
 */
public class modelBarang {
    private int id_barang;
    private String nama_barang;
    private String kode_barang;
    private int harga_barang;
    private int stok_barang;
    
    public modelBarang(int id_barang, String nama_barang, String kode_barang, int harga_barang, int stok_barang){
        this.id_barang = id_barang;
        this.nama_barang = nama_barang;
        this.kode_barang = kode_barang;
        this.harga_barang = harga_barang;
        this.stok_barang = stok_barang;
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
     * @return the nama_barang
     */
    public String getNama_barang() {
        return nama_barang;
    }

    /**
     * @param nama_barang the nama_barang to set
     */
    public void setNama_barang(String nama_barang) {
        this.nama_barang = nama_barang;
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
     * @return the harga_barang
     */
    public int getHarga_barang() {
        return harga_barang;
    }

    /**
     * @param harga_barang the harga_barang to set
     */
    public void setHarga_barang(int harga_barang) {
        this.harga_barang = harga_barang;
    }

    /**
     * @return the stok_barang
     */
    public int getStok_barang() {
        return stok_barang;
    }

    /**
     * @param stok_barang the stok_barang to set
     */
    public void setStock_barang(int stok_barang) {
        this.stok_barang = stok_barang;
    }

    
}