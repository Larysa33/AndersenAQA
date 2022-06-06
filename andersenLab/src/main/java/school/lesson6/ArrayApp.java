package school.lesson6;

import static java.lang.Integer.parseInt;
import static java.lang.String.*;

public class ArrayApp {
    public static void main(String[] args){

        String table [][] = {{"2", "2", "2", "2"}};
        try {
            checkArray(table);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("MyArraySizeException: неверный размер массива.");
        }
    }

    public static void checkArray(String[][] ignoredArr) {
        String [][] arr = new String [4][4];
            int [][] arr2 = new int [4][4];
        try {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length; j++) {
                    arr2[j] = parseInt(arr[j]);
                    arr2[i] = parseInt(arr[i]);
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("MyArrayDataException: " + e);
        }
        int sum = 0;
        for (int i = 0; i < arr2.length; i++) {
            sum = sum + arr2[i];
        }
    }
}
