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

        //persArray[4].setPhone("70"); - изменить значение переменной типа private
        //System.out.println(persArray[4].getAge()); - вывести возраст из элемента массива

        for (int i = 0; i < persArray.length; i++) {
            if (persArray[i].getAge()>40) {
                persArray[i].info();
                //System.out.println(persArray[i]); - вывести объект из массива
            }
        }

    }
}
