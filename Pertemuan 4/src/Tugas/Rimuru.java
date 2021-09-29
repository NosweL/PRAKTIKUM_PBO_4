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
public class Rimuru {
    private String nama;
    private String umur;
    private String jabatan;
    private String jenisTubuh;
    private int skalaKekuatan;

    Rimuru(){
        
    }
    Rimuru(String nama, String umur, String jabatan, String jenisTubuh, int skalaKekuatan){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
        this.jenisTubuh = jenisTubuh;
        this.skalaKekuatan = skalaKekuatan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getUmur() {
        return umur;
    }

    public void setUmur(String umur) {
        this.umur = umur;
    }

    public String getJabatan() {
        return jabatan;
    }

    public void setJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String getJenisTubuh() {
        return jenisTubuh;
    }

    public void setJenisTubuh(String jenisTubuh) {
        this.jenisTubuh = jenisTubuh;
    }

    public int getSkalaKekuatan() {
        return skalaKekuatan;
    }

    public void setSkalaKekuatan(int skalaKekuatan) {
        this.skalaKekuatan = skalaKekuatan;
    }
    public String info() {
        String info = "\nRimuru\n";
        info += "Nama: " + nama + "\n";
        info += "Umur: " + umur + "\n";
        info += "Jabatan: " + jabatan + "\n";
        info += "Jenis Tubuh: " + jenisTubuh + "\n";
        info += "Skala Kekuatan: " + skalaKekuatan + "\n";
        return info;
}
}
