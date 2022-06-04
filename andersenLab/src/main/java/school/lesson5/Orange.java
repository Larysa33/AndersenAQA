package school.lesson5;

import java.awt.event.WindowFocusListener;

public class Orange extends Fruit {

    public static final String name = "Апельсин";
    private String brand;

    public String getBrand(){
        return brand;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public static final float weight = 1.5f;
    public Orange(String brand){
        this.brand = brand;
    }


    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void info() {
        System.out.println(name + " " + getBrand());
        super.info();
    }
}
