package school.lesson6;

import static java.lang.Integer.parseInt;
//import static java.lang.String.*;

public class ArrayApp {
    public static void main(String[] args) {

        String table[][] = {{"4", "5", "i", "1"}, {"1", "2", "1", "8"}, {"1", "2", "1", "2"}, {"2", "2", "2", "2"}};
        try {
            int result = arraySum(table);
            System.out.println(result);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("MyArraySizeException: неверный размер массива.");
        } catch (NumberFormatException e) {
        }
    }

    public static int arraySum(String[][] arr) {
        int sum = 0;
        if (arr.length != 4) {
            throw new ArrayIndexOutOfBoundsException();
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                try {
                    sum = sum + Integer.parseInt(arr[i][j]);
                } catch (NumberFormatException e) {
                    System.out.println("MyArrayDataException: некорректный тип данных");
                    System.out.println("Ошибка в ячейке: " + i + "x" + j);
                }
            }
        }
        System.out.println("Сумма всех элементов массива = " + sum);
        return sum;
    }
}
