package school.lesson5;
import java.util.ArrayList;
public class Box <T> {
    private String name;

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }
    float boxWeight=0.0f;

    ArrayList <Fruit> list;

    public Box(String name){
        this.name = name;
        this.list = new ArrayList<>();
    }

    public float getWeight(Fruit f) {
        boxWeight = list.size() * f.getWeight();
        System.out.println(name);
        System.out.println("Вес коробки = " + boxWeight);
        System.out.println();
        return boxWeight;
    }

    public boolean compare(Box b) {
        if(boxWeight == b.boxWeight) {
            return true;
        } else {
            return false;
        }
    }

    public float addFruit(Fruit f) {
            list.add(f);
            boxWeight = boxWeight + f.getWeight();
        System.out.println("После добавления фрукта вес коробки = " + boxWeight);
        System.out.println();
            return boxWeight;
    }

    //Метод changeBoxes был исправлен с куратором
    public void changeBoxes(Box <T> sender){
        this.list.addAll(sender.list);
        this.boxWeight += sender.boxWeight;
        sender.list.clear();
        sender.boxWeight = 0;
        System.out.println("После пересыпания фруктов вес текущей коробки = " + this.boxWeight);
        System.out.println("Вторая коробка стала пустой, её вес теперь = " + sender.boxWeight);
        System.out.println();
    }
}
