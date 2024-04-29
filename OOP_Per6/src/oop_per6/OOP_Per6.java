package oop_per6;

import java.util.Scanner;
/**
 *
 * Ni Kadek Dwi Pratiwi
 * 2201010051
 * Kelas = U
 * Tgl 29 April 2024
 */
public class OOP_Per6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner dIN = new Scanner(System.in);
        
        System.out.println("Nilai Alas : ");
        float nAlas = dIN.nextFloat();
        
        System.out.println("Nilai Tinggi : ");
        float nTinggi  = dIN.nextFloat();
        
        LuasSegi3 LS = new LuasSegi3(nAlas,nTinggi);
        
        //LS.setAlas(nAlas);
        //LS.setTinggi(nTinggi);
        LS.HLuasSegi3();
        
        System.out.println("Nilai Alas: "+LS.getAlas() );
        System.out.println("Nilai Tinggi: "+LS.getTinggi() );
        System.out.println("Jadi Luas Segitiga: ");
        System.out.println("Luas = ½ X "+ LS.getAlas()+" X "+LS.getTinggi() );
        System.out.println("      = " + LS.getLuas() );
                
    }
    
}
