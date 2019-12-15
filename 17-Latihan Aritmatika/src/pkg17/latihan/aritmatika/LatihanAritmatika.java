/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg17.latihan.aritmatika;

import java.util.Scanner;

/**
 * NAMA  : HERI FIRMANSAH
 * NIM   : A2.1900079
 * KELAS : TI-IC
 * @author Heri Firmansah
 */
public class LatihanAritmatika {


    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int panjang, lebar, luas, tinggi, volume;
        // Membuat perhitungan menghitung luas persegi panjang
        // luas = panjang * lebar

        System.out.println("MENGHITUNG LUAS");
        System.out.print("panjang = ");
        panjang = userInput.nextInt();
        System.out.print("lebar = ");
        lebar = userInput.nextInt();

        luas = panjang * lebar;
        System.out.println("Luas = " + luas);

        System.out.println("MENGHITUNG VOLUME");
        System.out.print("tinggi = ");
        tinggi = userInput.nextInt();
        volume = luas*tinggi;
        System.out.println("volume = "+ volume);
    }
}

