package school.lesson4;

public class FeadCats {
    public static void main(String[] args) {
        Cat vasya = new Cat("Вася", 20);
        Plate plate = new Plate(50);
        plate.info();
        vasya.whetherSatiety(plate);
        vasya.eat(plate);
        System.out.println(vasya.getSatiety());
        plate.info();
        plate.addFood(20);
        plate.info();
    }
}
