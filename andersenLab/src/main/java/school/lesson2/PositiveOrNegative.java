package school.lesson2;

import java.util.Scanner;
public class PositiveOrNegative {
    public static void main(String args[]) {
        isPositiveorNegative();
    }

    public static void isPositiveorNegative() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое положительное или отрицательное число: ");
        int value = sc.nextInt();
        if (value >= 0) {
            System.out.println(value + " - положительное число");
        } else {
            System.out.println(value + " - отрицательное число");
        }
    }
}
