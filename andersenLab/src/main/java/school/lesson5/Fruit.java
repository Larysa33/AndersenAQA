package school.lesson5;

public class Fruit {
    protected float weight;
    public Fruit(){
    }


    public Fruit(float weight){
        this.weight = weight;
    }




    public float getWeight(){
        return weight;
    };

    public void info() {
       System.out.println("Вес одного фрукта = " + getWeight() + "кг");
       System.out.println();
    }
}
