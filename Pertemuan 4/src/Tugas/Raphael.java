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
public class Raphael {

    private String nama;
    private String jenis;
    private int scale;

    Raphael() {

    }

    Raphael(String nama, String jenis, int scale) {
        this.nama = nama;
        this.jenis = jenis;
        this.scale = scale;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public int getScale() {
        return scale;
    }

    public void setScale(int scale) {
        this.scale = scale;
    }

    public String info() {
        String info = "\nRaphael\n";
        info += "Nama: " + nama + "\n";
        info += "Jenis: " + jenis + "\n";
        info += "Scale: " + scale + "\n";
        return info;
    }
}
