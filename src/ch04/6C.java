package ch04;

public class 6C {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};
       
        System.out.print("Bilangan Ganjil :  ");
        for (ary i = 0; i < ary.length; i++){
            if (ary [i] % 2!= 0){
                System.out.print(ary[i] + " ");
            }
        }      
        System.out.println("");
    }
}
