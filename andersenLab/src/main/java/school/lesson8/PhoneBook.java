package school.lesson8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/*2. Написать простой класс Телефонный Справочник, который хранит в себе список фамилий и телефонных номеров.
В этот телефонный справочник с помощью метода add() можно добавлять записи, а с помощью метода get() искать номер телефона по фамилии.
Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев), тогда при запросе такой фамилии должны
выводиться все телефоны.
 */
public class PhoneBook {

        private HashMap <String, String> data;
        public PhoneBook() {
            this.data = new HashMap<>();
        }

        public HashMap<String, String> getData(){
        return data;
    }
        public void add(String number, String surname) {
            data.put(number, surname);
        }

        public void get(String surname){
            if(data.containsValue(surname)) {
                Set<Map.Entry<String, String>> set = data.entrySet();
                for (Map.Entry<String, String> temp : set) {
                    if(temp.getValue().equals(surname)) {
                        System.out.println(temp.getValue() + " : " + temp.getKey());
                    }
                }
            } else {
                System.out.println("В справочнике нет такой фамилии.");
            }
        }
}
