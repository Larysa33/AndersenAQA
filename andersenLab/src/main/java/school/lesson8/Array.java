package school.lesson8;

import java.util.ArrayList;
import java.util.HashSet;

/*1.Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся).
Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем).
Посчитать, сколько раз встречается каждое слово.
 */
@SuppressWarnings("rawtypes")
public class Array {
    public static void main(String[] args){
        HashSet list = new HashSet();
        list.add("Apple");
        list.add("Banana");
        list.add("Pear");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        list.add("Pear");
        list.add("Orange");
        list.add("Apple");
        list.add("Banana");
        System.out.println(list);
        System.out.println(list.size());
    }
}
