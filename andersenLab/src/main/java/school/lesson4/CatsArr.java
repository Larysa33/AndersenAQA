package school.lesson4;

import school.lesson3.Employee;

public class CatsArr {
    public static void main(String[] args) {
        Cat[] catsArray = new Cat[3];
        catsArray[0] = new Cat("Беляш", 10);
        catsArray[1] = new Cat("Черныш", 20);
        catsArray[2] = new Cat("Пухляш", 70);
        Plate plate2 = new Plate(100);
        plate2.info();
        for (int i = 0; i < catsArray.length; i++) {
            catsArray[i].whetherSatiety(plate2);
            catsArray[i].eat(plate2);
            System.out.println(catsArray[i].getSatiety());
            plate2.info();
        }
    }
}