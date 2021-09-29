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
public class Tempest {

    private String nama;
    private String jenisKota;
    private int kekayaan;

    Tempest() {

    }

    Tempest(String nama, String jenisKota, int kekayaan) {
        this.nama = nama;
        this.jenisKota = jenisKota;
        this.kekayaan = kekayaan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenisKota() {
        return jenisKota;
    }

    public void setJenisKota(String jenisKota) {
        this.jenisKota = jenisKota;
    }

    public int getKekayaan() {
        return kekayaan;
    }

    public void setKekayaan(int kekayaan) {
        this.kekayaan = kekayaan;
    }

    public String info() {
        String info = "\nTempest\n";
        info += "Nama: " + nama + "\n";
        info += "Jenis Kota: " + jenisKota + "\n";
        info += "kekayaan: " + kekayaan + "\n";
        return info;
    }
}
