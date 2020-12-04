/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.if10k.pkg10119920.umarsaidadipranoto.no3;

/**
 *
 * @author 
 * NAMA     : Umar Said Adi Pranoto
 * KELAS    : IF10K
 * NIM      : 10119920
 * Deskripsi Program : Program ini berisi program untuk menampilkan
 * jenis-jenis tipe data bilangan bulat
 * 
 */

public class Rnb extends MusicGenre implements Blues, Jazz {
    
    @Override
    public void genreBlues(String artistName){
        System.out.println(artistName + " adalah musisi Blues");
    }
    
    @Override
    public void genreJazz(String artistName){
        System.out.println(artistName + " adalah musisi Jazz");
    }
}