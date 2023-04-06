package org.example.homework_4;

import static java.lang.System.*;

public class array {
    public static void main(String[] agrs) {
        int[] array = new int[]{2, 5, 6, 7, 2, 4, 9, 4, 7};
        int sum = 0;

        for (int i = 0; i != array.length; i++) {
            sum += array[i];
            out.println(" сумма элементов " + sum);
        }




    int[][] biDimensionalArray = new int[][]{
            {1, 5, 4, 7, 8, 2},
            {1, 2, 3, 4, 5, 6},
            {7, 8, 9, 4, 6, 3}
    };


        for (int j = 0; j != biDimensionalArray.length; j++) {
            for (int i = 0; i != biDimensionalArray[j].length; i++) {
                if (biDimensionalArray[j][i] % 2 == 0) {
                    System.out.print(biDimensionalArray[j][i]);
                }
            }
        }

         System.out.println("----------------------");
        for (int j = 0; j != biDimensionalArray.length; j++) {
            for (int i = 0; i != biDimensionalArray[j].length; i++) {
                if (biDimensionalArray[j][i] % 2 != 0) {

                    System.out.print    (biDimensionalArray[j][i]);
                }
            }
        }
    }
}


