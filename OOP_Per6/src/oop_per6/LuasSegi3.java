package oop_per6;

/**
 *
 * Ni Kadek Dwi Pratiwi
 * 2201010051
 * Kelas = U
 * Tgl 29 April 2024
 */

public class LuasSegi3 {
    private float alas, tinggi, luas;
    
    public LuasSegi3(float Al,float Tg){
        alas = Al;
        tinggi = Tg;
    }  
        public void setAlas(float nVAL){ //kenapa tidak isi return, karna void artinya hampa, tidak ada nilai yg ditampilkan
            alas = nVAL;
        }
        public float getAlas() {
            return alas;
        }
        public void setTinggi(float nVAL){ //kenapa tidak isi return, karna void artinya hampa, tidak ada nilai yg ditampilkan
            tinggi = nVAL;
        }
        public float getTinggi() {
            return tinggi;
        }
        public void HLuasSegi3(){
            luas = (this.alas*this.tinggi)/2;
        }
        public float getLuas() {
            return luas;
        }
}
