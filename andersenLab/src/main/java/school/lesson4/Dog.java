package school.lesson4;

public class Dog extends Animal{
    private int appetite;

    public Dog(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(){

    }
    public final static int MAX_obstacleRunLength = 500;

    @Override
    public void run(int obstacleRunLength) {
        if (obstacleRunLength > MAX_obstacleRunLength) {
            System.out.println("Собаки не бегают больше 500 метров.");
        } else {
            super.run(obstacleRunLength);
        }
    }

    public final static int MAX_obstacleSwimLength = 10;
    @Override
    public void swim(int obstacleSwimLength) {
        if (obstacleSwimLength > MAX_obstacleSwimLength) {
            System.out.println("Собаки не плавают больше 10 метров.");
        } else {
            super.swim(obstacleSwimLength);
        }
    }
}
