package school.lesson5;

import java.awt.event.WindowFocusListener;

public class Apple extends Fruit{
    public static final String name = "яблоко";
    private String color;
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    private String brand;
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public static final float weight = 1.0f;

    public Apple(String color, String brand){
        this.color = color;
        this.brand = brand;
    }


    @Override
    public float getWeight() {
        return weight;
    }

    @Override
    public void info() {
        System.out.println(getColor() + " " + name + " " + getBrand());
        super.info();
    }
}
