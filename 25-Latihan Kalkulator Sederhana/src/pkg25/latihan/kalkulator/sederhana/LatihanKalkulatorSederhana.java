/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg25.latihan.kalkulator.sederhana;

import java.util.Scanner;

/**
 * NAMA  : HERI FIRMANSAH
 * NIM   : A2.1900079
 * KELAS : TI-IC
 * @author Heri Firmansah
 */
public class LatihanKalkulatorSederhana {

    public static void main (String[] args){

        // a operator b
        Scanner inputUser;
        float a,b,hasil;
        char operator;

        inputUser = new Scanner(System.in);

        System.out.print("nilai a= ");
        a = inputUser.nextFloat();
        System.out.print("operator= ");
        operator = inputUser.next().charAt(0);
        System.out.print("nilai b= ");
        b = inputUser.nextFloat();

        System.out.println("input user: " + a + " " + operator + " " + b);

        // operator tersedia * / + -

        if (operator == '+'){
            // penjumlahan
            hasil = a + b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '-'){
            //pengurangan
            hasil = a - b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '*'){
            //perkalian
            hasil = a * b;
            System.out.println("hasil = " + hasil);
        } else if (operator == '/'){
            //pembagian
            if (b == 0){
                System.out.println("pembagi nol menghasilkan tak hingga");
            } else{
                hasil = a / b;
                System.out.println("hasil = " + hasil);
            }
        } else {
            System.out.println("operator tidak ditemukan");
        }

    }
}
