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

    public Box(String name, ArrayList <Fruit> list){
        this.name = name;
        this.list = list;
    }

    public float getWeight(Fruit f) {
        boxWeight = list.size() * f.getWeight();
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
            return boxWeight;
    }

    /* Наброски метода по пересыпанию фруктов из одной коробки в другую
    public void changeBoxes(Box b){
        a.ArrayList <> list = new ArrayList<>();
        b.ArrayList <> list2 = new ArrayList<>();
        ((ArrayList<?>) list2).addAll(list);
        ((ArrayList<?>) list).removeAll(list);
        System.out.println(b.boxWeight);
    }
    */
}
