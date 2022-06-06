package school.lesson5;
import java.util.ArrayList;

public class FruitApp {
    public static void main(String[] args){
        Apple antonovka = new Apple("зелёное", "Антоновка");
        ArrayList <Apple> appleList = new ArrayList<>();
        antonovka.info();

        Orange turkish = new Orange("турецкий");
        ArrayList <Orange> orangeList = new ArrayList<>();
        turkish.info();


        Box <Apple> box1 = new <Apple> Box("коробка яблок");
        box1.getWeight(antonovka);
        box1.addFruit(antonovka);

        Box <Orange> box2 = new <Orange> Box("коробка апельсинов");
        box2.getWeight(turkish);
        box2.addFruit(turkish);
        box2.addFruit(turkish);

        System.out.println(box1.compare(box2));
        System.out.println();

        Box <Orange> box3 = new <Orange> Box("коробка апельсинов 2");
        box3.getWeight(turkish);
        box3.addFruit(turkish);
        box3.addFruit(turkish);
        box3.addFruit(turkish);

        box2.changeBoxes(box3);
    }
}
