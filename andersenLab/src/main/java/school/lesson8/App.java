package school.lesson8;

public class App {
    public static void main(String[] args){
        PhoneBook phoneBook1 = new PhoneBook();
        phoneBook1.add("+375299087650", "Иванов");
        phoneBook1.add("+375299089650", "Петров");
        phoneBook1.add("+375299080650", "Сидоров");
        phoneBook1.add("+375299081650", "Смирнов");
        phoneBook1.add("+375299084650", "Васильев");
        System.out.println(phoneBook1.getData());
        phoneBook1.get("Иванов");
        phoneBook1.get("Лентяев");
    }
}
