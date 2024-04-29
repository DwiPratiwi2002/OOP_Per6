package latihan6;

/**
* Ni Kadek Dwi Pratiwi
 * 2201010051
 * Kelas = U
 * Tgl 29 April 2024
 * */

import java.util.Scanner;

public class Latihan6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Program Menghitung Luas dan Keliling Persegi");
        System.out.print("Masukkan panjang sisi persegi (dalam satuan cm): ");
        double sisi = scanner.nextDouble();

        // Menghitung luas persegi
        double luas = sisi * sisi;

        // Menghitung keliling persegi
        double keliling = 4 * sisi;

        System.out.println("Luas persegi dengan sisi " + sisi + " cm adalah: " + luas + " cm^2");
        System.out.println("Keliling persegi dengan sisi " + sisi + " cm adalah: " + keliling + " cm");

        // Menutup scanner
        scanner.close();
    }
}
