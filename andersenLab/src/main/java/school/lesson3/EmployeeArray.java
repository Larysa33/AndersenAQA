package school.lesson3;

import java.util.Arrays;

public class EmployeeArray {
    public static void main(String[] args) {
        Employee[] persArray = new Employee[5];
        persArray[0] = new Employee("Хатакэ Какаси Леонидович", "джоунин-капитан",
                "kakasi@gmail.com", "375298576400", 2000, 30);
        persArray[1] = new Employee("Учиха Саске Юрьевич", "генин",
                "saske@yahoo.com", "375256748378", 800, 20);
        persArray[2] = new Employee("Харуно Сакура Валерьевна", "ниндзя медик",
                "sakura@mail.ru", "375259748378", 800, 20);
        persArray[3] = new Employee("Удзумаки Наруто Владиславович", "генин",
                "naruto@mail.ru", "375259748678", 800, 20);
        persArray[4] = new Employee("Сарутоби Хирудзен Петрович", "хокагэ",
                "hirudzen@gmail.com", "375259948678", 5000, 60);

        for(int i = 100; i<100&&i>40; i--){
            if (persArray[i]>40) {
                System.out.println(persArray[i].toString());
            }
        }
    }
}
