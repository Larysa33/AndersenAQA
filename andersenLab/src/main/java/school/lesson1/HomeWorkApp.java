package school.lesson1;

public class HomeWorkApp {
    //Задания 1,6
    public static void main(String args[]) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }

    //Задание 2
    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    //Задание 3
    public static void checkSumSign() {
        int a, b;
        a = b = -1;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }

    //Задание 4
    public static void printColor() {
        int value = 101;

        if (value <= 0) {
            System.out.println("Красный");
        }
        if (value > 0 && value <= 100) {
            System.out.println("Жёлтый");
        }

        if (value > 100) {
            System.out.println("Зелёный");
        }
    }

    //Задание 5
    public static void compareNumbers(){
        int a,b;
        a=2;
        b=1;
        if (a>=b){
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }
}
