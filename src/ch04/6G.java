package ch04;

public class 6G {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        System.out.println("Angka Kelipatan 5 dan Sebelumnya juga Kelipatan 5");
        System.out.println("-------------------------------------------------");
        for (int i = 0; i < ary.length; i++){
            if (ary[i] %5 == 0 && ary[i-1] %5 == 0){
                System.out.println(ary[i]);
            }
        }

    }
}