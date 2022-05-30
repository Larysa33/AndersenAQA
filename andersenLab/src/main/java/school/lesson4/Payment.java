package school.lesson4;

public class Payment {
    protected String cardNumber;
    protected String cardHolderName;
    protected String cardValidTo;

    public Payment(String cardNumber, String cardHolderName, String cardValidTo){
        this.cardNumber = cardNumber;
        this.cardHolderName = cardHolderName;
        this.cardValidTo = cardValidTo;
    }

    public void info(){
        System.out.println("Номер карты: " + cardNumber);
        System.out.println("Владелец карты: " + cardHolderName);
        System.out.println("Срок действия карты: " + cardValidTo);
        System.out.println("********************************************************");
    }

    public class Item {
        private String name;
        private int price;
        private int amount;

        public Item(String name, int price, int amount){
            this.name = name;
            this.price = price;
            this.amount = amount;
        }

        public void totalPrice(){
            int totalPrice = this.price * this.amount;
            System.out.println("Общая стоимость: " + totalPrice + "$");
        }


        //public int totalPrice = this.price * this.amount;
        public final static int MIN_amount = 1;

        public void info(){
            if (this.amount<MIN_amount){
                System.out.println("Количество товара не может быть 0.");
            } else {
                System.out.println("Наименование товара: " + name);
                System.out.println("Количество товара: " + amount);
                totalPrice();
                System.out.println();
            }
        }

    }
}
