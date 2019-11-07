/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118067.latihan59.detectiveconan;

/**
 *
 * @author Kiyo
 */
public class DetectiveConan {
    protected String nama;
    protected String bio;
    
    public DetectiveConan(String nama, String bio){
        this.nama = nama;
        this.bio = bio;

    }
    
    public void DisplayChara(){
        System.out.println("Nama Chara  : " + nama);
        System.out.println("Bio Chara   : " + bio);
    }
}
