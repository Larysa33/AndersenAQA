package school.lesson4;

public class Park {
    protected String name;
    protected String workingHours;
    protected String daysOff;

    public Park(String name, String workingHours,String daysOff){
        this.name = name;
        this.workingHours = workingHours;
        this.daysOff = daysOff;
    }

    public void info(){
        System.out.println(name + " открыт со среды по воскресенье " + workingHours + ". ");
        System.out.println(daysOff + " - не рабочие дни.");
        System.out.println("Со списком аттракционов можно ознакомиться ниже:");
        System.out.println();
    }

    public class Ride{
        private String name;
        private String description;
        private int adultTicket;
        private int childTicket;

        public Ride(String name, String description, int adultTicket, int childTicket){
            this.name = name;
            this.description = description;
            this.adultTicket = adultTicket;
            this.childTicket = childTicket;
        }
        public void info (){
            System.out.println(name);
            System.out.println("***");
            System.out.println(description);
            System.out.println("Стоимость билета для взрослого: " + adultTicket + "$");
            System.out.println("Стоимость билета для ребёнка: " + childTicket + "S");
            System.out.println();
        }
    }
}
