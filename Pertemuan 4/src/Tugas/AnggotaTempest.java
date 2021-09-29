/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas;

/**
 *
 * @author welso
 */
public class AnggotaTempest {
    private String nama;
    private String jenisKelamin;
    private String jabatan;
    private int kekuatan;
    
    AnggotaTempest(){
        
    }
    AnggotaTempest(String nama, String jenisKelamin, String jabatan, int kekuatan){
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.jabatan = jabatan;
        this.kekuatan = kekuatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public void setJenisKelamin(String jenisKelamin) {
        this.jenisKelamin = jenisKelamin;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public int getKekuatan() {
        return kekuatan;
    }

    public void setKekuatan(int kekuatan) {
        this.kekuatan = kekuatan;
    }
    public String info() {
        String info = "\nAnggota Tempest\n";
        info += "Nama: " + nama + "\n";
        info += "Jenis Kelamin: " + jenisKelamin + "\n";
        info += "Jabatan: " + jabatan + "\n";
        info += "Kekuatan " + kekuatan + "\n";
        return info;
    }
}
