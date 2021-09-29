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
public class MainRimuru {
    public static void main(String[]args){
        System.out.println("Komik Tensei Shitara Slime Datta Ken");
        System.out.println("====== RIMURU TEMPEST =====");
        
        Rimuru rimuru = new Rimuru("Mikami Satoru","24","Penguasa Hutan Jura","Reincarnasi",100);
        
        
        Tempest tempest = new Tempest("Hutan Jura Besar","Kota Monster",2000000000);
        Raphael raphael = new Raphael("Raphael","Guide System",0);
        AnggotaTempest at1 = new AnggotaTempest("Benimaru","Laki-Laki","Bawahan Elite ke 2",40);
        AnggotaTempest at2 = new AnggotaTempest("Diablo","Laki-Laki","Bawahan Elite ke 5",95);
        
        System.out.println(rimuru.info());
       
        System.out.println("================================");
        System.out.println(tempest.info());
        System.out.println("================================");
        System.out.println(tempest.info());
        System.out.println("================================");
        System.out.println(raphael.info());
        System.out.println("================================");
        System.out.println(at1.info());
        System.out.println(at2.info());
    }
}
