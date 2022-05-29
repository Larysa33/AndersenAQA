package school.lesson4;

public class DogsApp {
    public static void main(String[] args) {
        Dog barbos = new Dog("Барбос", 100);
        barbos.run(400);
        barbos.swim(10);
        barbos.animalInfo();
    }
}
