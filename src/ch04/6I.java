package ch04;

public class 6I {
    public static void main(String[] args) {
        int[] ary = {82, 12, 41, 38, 19, 26, 9, 48, 20, 55, 8, 32, 3};

        for (int i = 1; i < ary.length; i++){
            System.out.print("Selisih dari " + ary[i-1] + " dan " + ary[i] + " = ");
            System.out.println(ary[i-1] - ary[i]);
        }

	
    }
}