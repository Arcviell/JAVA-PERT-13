/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg50.string.builder;
/**
 * NAMA  : HERI FIRMANSAH
 * NIM   : A2.1900079
 * KELAS : TI-IC
 * @author Heri Firmansah
 */
public class StringBuilder {



    public static void main(String[] args) {

        StringBuilder builder = new StringBuilder("halo");
        printData(builder);

        // append
        builder.append(" semuanya");
        printData(builder);

        builder.append(" warga Surabaya");
        printData(builder);

        // insert
        builder.insert(19," Kota");
        printData(builder);

        // delete
        builder.delete(19,24);
        printData(builder);

        // rubah character pada index tertentu
        builder.setCharAt(14,'W');
        printData(builder);

        // replace
        builder.replace(20,28,"Bandung");
        printData(builder);

        // casting menjadi string
        String kalimat = builder.toString();
        System.out.println(kalimat);
        int addressString = System.identityHashCode(kalimat);
        System.out.println("address = " + Integer.toHexString(addressString));

    }

    private static void printData(StringBuilder dataBuilder){
        System.out.println("data = " + dataBuilder);
        System.out.println("panjang = " + dataBuilder.length());
        System.out.println("kapasitas = " + dataBuilder.capacity());

        int addressBuilder = System.identityHashCode(dataBuilder);
        System.out.println("address = " + Integer.toHexString(addressBuilder));
    }

    private StringBuilder(String halo) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void append(String semuanya) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void insert(int i, String kota) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void delete(int i, int i0) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void setCharAt(int i, char c) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private void replace(int i, int i0, String bandung) {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String length() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

    private String capacity() {
        throw new UnsupportedOperationException("Not yet implemented");
    }

}
