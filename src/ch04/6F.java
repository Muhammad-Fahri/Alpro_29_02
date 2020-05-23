package ch04;

public class 6F {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka Ganjil di apit Angka Genap");
        System.out.println("--------------------------------");

        for (int i = 0; i < ary.length-1; i++){
            if (ary[i] %2 != 0){
                System.out.println(ary[i]);
            }
        }


    }
}