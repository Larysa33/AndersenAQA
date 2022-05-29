package school.lesson4;

public class Animal {
    protected String name;
    public Animal() {
    }


    public Animal(String name){
        this.name=name;
    }
    public void animalInfo(){
        System.out.println("Животное: " + name);
    }

    public void run(int obstacleRunLength){
        System.out.println(name + "пробежал " + obstacleRunLength + " м.");
    }

    public void swim(int obstacleSwimLength){
        System.out.println(name + "проплыл " + obstacleSwimLength + " м.");
    }

}

