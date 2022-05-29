package school.lesson4;

public class Cat extends Animal {
    private int appetite;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat() {
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
        super.swim(obstacleSwimLength);
        System.out.println("Коты не умеют плавать.");
    }
}
