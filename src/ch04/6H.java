package ch04;

public class 6H {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
        int jml = 0;

        for (int i = 0; i < ary.length; i++){
            jml = jml + ary[i];
        }

        System.out.println("Hasil Jumlah Angka = " + jml);


    }
}