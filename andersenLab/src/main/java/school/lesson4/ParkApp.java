package school.lesson4;

public class ParkApp {
    public static void main(String[] args){
        Park park = new Park("Disneyland", "с 9:00 до 21:00", "Понедельник и вторник");
        park.info();
        Park.Ride devilWheel = park.new Ride("Чёртово колесо", "блаблабла", 20, 15);
        Park.Ride cups = park.new Ride("Чашки", "блаблабла", 15, 8);
        devilWheel.info();
        cups.info();
    }
}
