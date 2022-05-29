package school.lesson4;

public class Cat extends Animal {
    private int appetite;

    public int getAppetite() {
        return appetite;
    }

    public void setAppetite(int appetite) {
        this.appetite = appetite;
    }

    private boolean satiety = false;

    public boolean getSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }


    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        if (this.appetite>p.getFood()){
            System.out.println("В тарелке не хватает еды.");
        } else{
            p.decreaseFood(this.appetite);
        }
    }

    public void whetherSatiety(Plate p){
        if (p.getFood()>=this.appetite){
            this.satiety = true;
        }
    }
    public final static int MAX_obstacleRunLength = 200;

    @Override
    public void run(int obstacleRunLength) {
        if(obstacleRunLength>MAX_obstacleRunLength) {
            System.out.println("Коты не бегают больше 200 метров.");
        } else {
            super.run(obstacleRunLength);
        }
    }

    @Override
    public void swim(int obstacleSwimLength) {
        System.out.println("Коты не умеют плавать.");
    }
}
