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

public class Country extends MusicGenre{
    
    private String artistName;
    
    @Override
    public String getArtistName(){
        return artistName;
    }
    
    @Override
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }
}