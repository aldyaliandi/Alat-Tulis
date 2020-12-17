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
public class modelKaryawan {
    private String nik;
    private String nama_karyawan;
    private String lahir_karyawan;
    private String kelamin_karyawan;
    private String alamat_karyawan;
    private String email_karyawan;
    
    public modelKaryawan(String nik, String nama_karyawan, String lahir_karyawan, String kelamin_karyawan, String alamat_karyawan,
                    String email_karyawan){
        
        this.nik = nik;
        this.nama_karyawan = nama_karyawan;
        this.lahir_karyawan = lahir_karyawan;
        this.kelamin_karyawan = kelamin_karyawan;
        this.alamat_karyawan = alamat_karyawan;
        this.email_karyawan = email_karyawan;
    }

    /**
     * @return the nik
     */
    public String getNik() {
        return nik;
    }

    /**
     * @param nik the nik to set
     */
    public void setNik(String nik) {
        this.nik = nik;
    }

    /**
     * @return the nama_karyawan
     */
    public String getNama_karyawan() {
        return nama_karyawan;
    }

    /**
     * @param nama_karyawan the nama_karyawan to set
     */
    public void setNama_karyawan(String nama_karyawan) {
        this.nama_karyawan = nama_karyawan;
    }

    /**
     * @return the lahir_karyawan
     */
    public String getLahir_karyawan() {
        return lahir_karyawan;
    }

    /**
     * @param lahir_karyawan the lahir_karyawan to set
     */
    public void setLahir_karyawan(String lahir_karyawan) {
        this.lahir_karyawan = lahir_karyawan;
    }

    /**
     * @return the kelamin_karyawan
     */
    public String getKelamin_karyawan() {
        return kelamin_karyawan;
    }

    /**
     * @param kelamin_karyawan the kelamin_karyawan to set
     */
    public void setKelamin_karyawan(String kelamin_karyawan) {
        this.kelamin_karyawan = kelamin_karyawan;
    }

    /**
     * @return the alamat_karyawan
     */
    public String getAlamat_karyawan() {
        return alamat_karyawan;
    }

    /**
     * @param alamat_karyawan the alamat_karyawan to set
     */
    public void setAlamat_karyawan(String alamat_karyawan) {
        this.alamat_karyawan = alamat_karyawan;
    }

    /**
     * @return the email_karyawan
     */
    public String getEmail_karyawan() {
        return email_karyawan;
    }

    /**
     * @param email_karyawan the email_karyawan to set
     */
    public void setEmail_karyawan(String email_karyawan) {
        this.email_karyawan = email_karyawan;
    }
}
