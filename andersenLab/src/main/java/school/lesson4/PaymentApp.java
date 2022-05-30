package school.lesson4;

public class PaymentApp {
    public static void main(String[] args){
        Payment ivan = new Payment("1234 5678 9012 3456", "Petrov Ivan", "05.27");
        ivan.info();
        Payment.Item cups = ivan.new Item("Кружка керамическая", 3, 4);
        Payment.Item football = ivan.new Item("мяч футбольный", 7, 0);
        cups.info();
        football.info();


    }
}
