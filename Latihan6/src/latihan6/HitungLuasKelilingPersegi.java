package latihan6;

public class HitungLuasKelilingPersegi {
    private float sisi;
    
    // Konstruktor untuk inisialisasi panjang sisi persegi
    public HitungLuasKelilingPersegi(float sisi) {
        this.sisi = sisi;
    }
    
    // Metode untuk mengatur panjang sisi persegi
    public void setSisi(float sisi) {
        this.sisi = sisi;
    }
    
    // Metode untuk mendapatkan panjang sisi persegi
    public float getSisi() {
        return sisi;
    }
    
    // Metode untuk menghitung luas persegi
    public float hitungLuasPersegi() {
        return sisi * sisi;
    }
    
    // Metode untuk menghitung keliling persegi
    public float hitungKelilingPersegi() {
        return 4 * sisi;
    }
}
