package school.lesson5;
import java.util.ArrayList;

public class FruitApp {
    public static void main(String[] args){
        Apple antonovka = new Apple("зелёное", "Антоновка");
        ArrayList <Apple> appleList = new ArrayList<>();
        appleList.add(antonovka);
        appleList.add(antonovka);
        appleList.add(antonovka);
        antonovka.info();

        Orange turkish = new Orange("турецкий");
        ArrayList <Orange> orangeList = new ArrayList<>();
        orangeList.add(turkish);
        orangeList.add(turkish);
        orangeList.add(turkish);
        turkish.info();


        Box <Apple> box1 = new <Apple> Box("коробка яблок",  appleList);
        Box <Orange> box2 = new <Orange> Box("коробка апельсинов", orangeList);
        System.out.println(box1.getWeight(antonovka));
        System.out.println(box1.compare(box2));
        System.out.println();
        System.out.println(box2.getWeight(turkish));
        System.out.println(box2.compare(box1));
        System.out.println();
        System.out.println(box1.addFruit(antonovka));

    }
}
